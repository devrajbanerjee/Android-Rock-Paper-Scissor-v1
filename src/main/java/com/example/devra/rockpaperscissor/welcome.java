package com.example.devra.rockpaperscissor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    public Button butLaunch;
    public void init(){
        butLaunch = (Button)findViewById(R.id.butLaunch);
        butLaunch.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent toy = new Intent(welcome.this, play.class);
            startActivity(toy);
        }
        });
    }

    public Button butLogin;
    public void init1(){
        butLogin = (Button)findViewById(R.id.butLogin);
        butLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(welcome.this, login.class);
                startActivity(toy);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
        init1();
    }

    public void clickOut(View view) {
        finish();
    }

    public void showRules(View view) {
        Intent toy = new Intent(welcome.this,rules.class);
        startActivity(toy);
    }
}
