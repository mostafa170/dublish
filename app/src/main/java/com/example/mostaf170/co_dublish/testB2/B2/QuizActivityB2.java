package com.example.mostaf170.co_dublish.testB2.B2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.testB2.datatestA1.DbHelper;

import java.util.List;

public class QuizActivityB2 extends AppCompatActivity {
	List<Question> quesList;
	int score=0;
	int qid=0;
	Question currentQ;
	TextView txtQuestion;
	RadioButton rda, rdb, rdc;
	Button butNext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz_bb);
		DbHelper db=new DbHelper(this);
		quesList=db.getAllQuestions();
		currentQ=quesList.get(qid);
		txtQuestion=(TextView)findViewById(R.id.textView1);
		rda=(RadioButton)findViewById(R.id.radio0);
		rdb=(RadioButton)findViewById(R.id.radio1);
		rdc=(RadioButton)findViewById(R.id.radio2);
		butNext=(Button)findViewById(R.id.button1);
		setQuestionView();
		butNext.setOnClickListener(new View.OnClickListener() {		
			@Override
			public void onClick(View v) {
				RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);

                if (grp.getCheckedRadioButtonId() == -1){
					return;
				}

				RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());

				grp.clearCheck();
				//Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());

				if(currentQ.getANSWER().equals(answer.getText()))
				{
					score++;
					Log.d("score", "Your score"+score);
				}
				if(qid<12){
					currentQ=quesList.get(qid);
					setQuestionView();
				}else{
					Intent intent = new Intent(QuizActivityB2.this, ResultActivityB2.class);
					Bundle b = new Bundle();
					b.putInt("score", score); //Your score
					intent.putExtras(b); //Put your score to your next Intent
					startActivity(intent);
					finish();
				}
			}
		});
	}
	private void setQuestionView()
	{
		txtQuestion.setText(currentQ.getQUESTION());
		rda.setText(currentQ.getOPTA());
		rdb.setText(currentQ.getOPTB());
		rdc.setText(currentQ.getOPTC());
		qid++;
	}
}
