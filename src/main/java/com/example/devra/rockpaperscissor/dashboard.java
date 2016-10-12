package com.example.devra.rockpaperscissor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void startGame(View view) {
        Intent toy = new Intent(dashboard.this, play.class);
        startActivity(toy);
    }

    public void exitGame(View view) {
        finish();
    }
}
