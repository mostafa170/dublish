package com.example.mostaf170.co_dublish;


import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mostaf170.co_dublish.databaselogin.SqliteHelper;
import com.example.mostaf170.co_dublish.databaselogin.User;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

/**
 * Created by mostaf170 on 21/11/2018.
 */

public class LoginActivity extends AppCompatActivity {

    //facebook
    private static final String EMAIL = "email";
    private static final String USER_POSTS = "user_posts";
    private static final String AUTH_TYPE = "rerequest";

    private CallbackManager mCallbackManager;


    //Declaration EditTexts
    EditText editTextEmail;
    EditText editTextPassword;

    //Declaration TextInputLayout
    TextInputLayout textInputLayoutEmail;
    TextInputLayout textInputLayoutPassword;

    //Declaration Button
    Button buttonLogin;

    //Declaration SqliteHelper
    SqliteHelper sqliteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //facebook
        mCallbackManager = CallbackManager.Factory.create();

        LoginButton mLoginButton = findViewById(R.id.login_button);

        // Set the initial permissions to request from the user while logging in
        mLoginButton.setReadPermissions(Arrays.asList(EMAIL, USER_POSTS));

        mLoginButton.setAuthType(AUTH_TYPE);
        // Register a callback to respond to the user
        mLoginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                setResult(RESULT_OK);
                LoginActivity.this.startActivity(new Intent(LoginActivity.this,IntroActivity.class));
                finish();
            }

            @Override
            public void onCancel() {
                setResult(RESULT_CANCELED);
                Toast.makeText(getApplicationContext(),"operation cancelled",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException e) {
                Toast.makeText(getApplicationContext(),"Error in operation",Toast.LENGTH_LONG).show();
            }
        });

//---------------------------------------------------
        sqliteHelper = new SqliteHelper(this);
        initCreateAccountTextView();
        initViews();

        //set click event of login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Check user input is correct or not
                if (validate()) {

                    //Get values from EditText fields
                    String Email = editTextEmail.getText().toString();
                    String Password = editTextPassword.getText().toString();

                    //Authenticate user
                    User currentUser = sqliteHelper.Authenticate(new User(null, null, Email, Password));

                    //Check Authentication is successful or not
                    if (currentUser != null) {

                        //User Logged in Successfully Launch You home screen activity
                        Intent intent=new Intent(LoginActivity.this,IntroActivity.class);
                        startActivity(intent);
                        finish();
                    } else {

                        //User Logged in Failed
                        Snackbar.make(buttonLogin, "Failed to log in , please try again", Snackbar.LENGTH_LONG).show();

                    }
                }
            }
        });


    }

    //this method used to set Create account TextView text and click event( maltipal colors
    // for TextView yet not supported in Xml so i have done it programmatically)
    private void initCreateAccountTextView() {
        TextView textViewCreateAccount = (TextView) findViewById(R.id.textViewCreateAccount);
        textViewCreateAccount.setText(fromHtml("<font color='#FF3333'>I don't have account yet. </font><font color='#000'>create one</font>"));
        textViewCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    //this method is used to connect XML views to its Objects
    private void initViews() {
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);

    }

    //This method is for handling fromHtml method deprecation
    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }

    //This method is used to validate input given by user
    public boolean validate() {
        boolean valid = false;

        //Get values from EditText fields
        String Email = editTextEmail.getText().toString();
        String Password = editTextPassword.getText().toString();

        //Handling validation for Email field
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(Email).matches()) {
            valid = false;
            textInputLayoutEmail.setError("Please enter valid email!");
        } else {
            valid = true;
            textInputLayoutEmail.setError(null);
        }

        //Handling validation for Password field
        if (Password.isEmpty()) {
            valid = false;
            textInputLayoutPassword.setError("Please enter valid password!");
        } else {
            if (Password.length() > 5) {
                valid = true;
                textInputLayoutPassword.setError(null);
            } else {
                valid = false;
                textInputLayoutPassword.setError("Password is to short!");
            }
        }

        return valid;
    }


    //facebook
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        mCallbackManager.onActivityResult(requestCode,resultCode,data);
    }
}