package com.example.bello.ariya;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bello on 6/30/2015.
 */
public class SignUpPage extends ActionBarActivity {

    TextView mainText;
    EditText uName, uEmail, uPassword;
    Button signMeUp;


    public SignUpPage() {
        //black constructor method
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mainText = (TextView) findViewById(R.id.ariyaText2);
        uName = (EditText) findViewById(R.id.nameEditText2);
        uEmail = (EditText) findViewById(R.id.emailEditText2);
        uPassword = (EditText) findViewById(R.id.passwordEditText2);
        signMeUp = (Button) findViewById(R.id.signUpButton2);

        setFont();
    }

    //sets the font for the sign up page
    public void setFont() {
        Typeface mainNameTypeFace = Typeface.createFromAsset(getAssets(), "Bevan.ttf");
        mainText.setTypeface(mainNameTypeFace);
    }

    //handles the stuff from the new user
    public void newUser(View view) {

        String userName = uName.getText().toString();
        String userEmail = uEmail.getText().toString();
        String userPassword = uPassword.getText().toString();

        Toast.makeText(getApplicationContext(), "Welcome "+userName, Toast.LENGTH_SHORT).show();

    }

}//close class
