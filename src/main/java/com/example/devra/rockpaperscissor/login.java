package com.example.devra.rockpaperscissor;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    String userId;
    String userL;
    int cellNum;
    String password;
    String passL;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void setUser(View view) {

        final EditText etUserName = (EditText)findViewById(R.id.userName);
        final EditText etPassword = (EditText)findViewById(R.id.textPassword);

        String iD = etUserName.getText().toString();
        String pw = etPassword.getText().toString();
        userId=iD;
        password=pw;
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("User ID = "+userId+"\nPassword = "+password+".").create();
        myAlert.show();
    }

    public void logUser(View view) {

        EditText enterUserName = (EditText)findViewById(R.id.loginUser);
        EditText enterPassword = (EditText)findViewById(R.id.loginPassword);

        String userL = enterUserName.getText().toString();
        String passL = enterPassword.getText().toString();

        if ((userL.equals(userId)) && (passL.equals(password))){
            Intent toy = new Intent(login.this, dashboard.class);
            startActivity(toy);
        }
    }

    public void exitScreen(View view) {
        finish();
    }
}
