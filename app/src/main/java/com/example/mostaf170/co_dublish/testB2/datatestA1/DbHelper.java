package com.example.mostaf170.co_dublish.testB2.datatestA1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.mostaf170.co_dublish.testB2.B2.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.KEY_ANSWER;
import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.KEY_ID;
import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.KEY_OPTA;
import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.KEY_OPTB;
import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.KEY_OPTC;
import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.KEY_QUES;
import static com.example.mostaf170.co_dublish.testB2.datatestA1.QuizContract.MovieEntry.TABLE_QUEST;

public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "triviaQuiz";
	// tasks table name

	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
		db.execSQL(sql);		
		addQuestions();
		//db.close();
	}
	private void addQuestions()
	{
		Question q1=new Question("Al ________ a ese chico, se enamoró de él.","vio", "ver", "visto", "ver");
		this.addQuestion(q1);
		Question q2=new Question("Los niños todavía ________ dormidos.", "son", "están", "nulo", "están");
		this.addQuestion(q2);
		Question q3=new Question("Iremos al concierto ________ que llueva.","si no", "a no ser","por", "a no ser" );
		this.addQuestion(q3);
		Question q4=new Question("Trae_______ porque hace muchísimo frío.", "bolso", "paraguas", "abrigo","abrigo");
		this.addQuestion(q4);
		Question q5=new Question("Los libros ________ me dejaste son muy entretenidos.","quienes","que","cuales","que");
		this.addQuestion(q5);
		Question q6=new Question("Quiero comprar champú, así que voy a ir a ________.","una charcutería","una churrería","una droguería","una droguería");
		this.addQuestion(q6);
		Question q7=new Question("¿Qué me quieres ________?","decir", "dices","digo", "decir" );
		this.addQuestion(q7);
		Question q8=new Question("Es importante que ________ un diccionario a clase.", "traerás", "traigas", "traes","traigas");
		this.addQuestion(q8);
		Question q9=new Question("Si no ________ en esta situación tan difícil, no te pediría ayuda", "esté", "estaba", "estuviera","estuviera");
		this.addQuestion(q9);
		Question q10=new Question("¿________ de los dos vestidos te gusta más?", "Cuáles", "Cuál", "Que","Cuáles");
		this.addQuestion(q10);
		Question q11=new Question("Si quieres hacer una copia de tus llaves, ve a una ________.", "ferretería", "carnicería", "peluquería","ferretería");
		this.addQuestion(q11);
		Question q12=new Question("Te conté la verdad pero no ________ creíste.", "se la", "te la", "me le","te la");
		this.addQuestion(q12);

	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION()); 
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST + " ORDER BY "+ "RANDOM()";
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
            Collections.shuffle(quesList);
		}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}
