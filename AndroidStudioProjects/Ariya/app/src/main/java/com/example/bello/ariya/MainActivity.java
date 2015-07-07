package com.example.bello.ariya;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    TextView mainName;
    EditText email, password;
    Typeface mainNameTypeFace;

    protected CheckBox check1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeButtons(); //initializes the buttons
    }

    private void initializeButtons() {
        mainNameTypeFace = Typeface.createFromAsset(getAssets(), "Bevan.ttf");
        mainName = (TextView) findViewById(R.id.ariyaText);
        mainName.setTypeface(mainNameTypeFace);

        email = (EditText) findViewById(R.id.emailEditText);
        password = (EditText) findViewById(R.id.passwordEditText);

        check1 = (CheckBox) findViewById(R.id.remeberMeCheckButton);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //user pressed the log in button
    public void logIn(View view) {

        //To do: get user email and password, validate it in the database and log them in

        //checks if remember me is checked
        if(check1.isChecked() == true) {
            Toast.makeText(getApplicationContext(), "We will remember you bruh", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(getApplicationContext(), "it does not work", Toast.LENGTH_SHORT).show();
        }




    }

    //we have a new user that wants to sign up
    public void signUp(View view) {
        //will open the sign up page for the new user
        //setContentView(R.layout.sign_up);
        startActivity(new Intent(getApplicationContext(), SignUpPage.class));

    }


    //dumbass user forgot their password
    public void forgotPassword(View view) {

        startActivity(new Intent(getApplicationContext(), ForgottenPassword.class));

    }
}
