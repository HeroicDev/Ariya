package com.example.bello.ariya;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Bello on 7/3/2015.
 */
public class ForgottenPassword extends ActionBarActivity {


    Button findMeButton;
    EditText userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_layout);

        findMeButton = (Button) findViewById(R.id.findMeButton);
        userEmail = (EditText) findViewById(R.id.userEmailEditText);
    }

    //looks for the user
    public void findMe(View view) {

        Toast.makeText(getApplicationContext(), "We will find you some day", Toast.LENGTH_SHORT).show();

    }
}
