package com.example.mostaf170.co_dublish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

/**
 * Created by mostaf170 on 23/11/2018.
 */

public class IntroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //facebook
        if(AccessToken.getCurrentAccessToken()==null){
            goLoginScreen();
        }

        Button commenzar;
        commenzar = (Button) findViewById(R.id.commenzar);
        commenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void goLoginScreen() {

        Intent intent=new Intent(this,LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    public void logout(View view){
        LoginManager.getInstance().logOut();
        goLoginScreen();
    }
}
