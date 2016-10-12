package com.example.devra.rockpaperscissor;

import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class play extends AppCompatActivity {

    MediaPlayer mySound;
    int score = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        mySound=MediaPlayer.create(this,R.raw.music);
    }

    public void playRock(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        int i = (int)(Math.random()*3+1);
        if (i==1) {
            score++;
            myAlert.setMessage("You Played Rock\nI played Scissor\nYou Won!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
        else if (i==2){
            score--;
            myAlert.setMessage("You Played Rock\nI played Paper\nYou Lost!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
        else{
            myAlert.setMessage("You Played Rock\nand I played Rock\nIts a Draw!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
    }

    public void playPaper(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        int i = (int)(Math.random()*3+1);
        if (i==1) {
            score++;
            myAlert.setMessage("You Played Paper\nI played Rock\nYou Won!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
        else if (i==2){
            score--;
            myAlert.setMessage("You Played Paper\nI played Scissor\nYou Lost!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
        else{
            myAlert.setMessage("You Played Paper\nand I played Paper\nIts a Draw!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
    }

    public void playScissor(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        int i = (int)(Math.random()*3+1);
        if (i==1) {
            score++;
            myAlert.setMessage("You Played Scissor\nI played Paper\nYou Won!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
        else if (i==2){
            score--;
            myAlert.setMessage("You Played Scissor\nI played Rock\nYou Lost!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
        else{
            myAlert.setMessage("You Played Scissor\nand I played Scissor\nIts a Draw!!\nScore = "+score+"\nTap anywhere to continue.").create();
            myAlert.show();
        }
    }

    public void playToggle(View view) {
        mySound.isLooping();
        boolean checked = ((ToggleButton)view).isChecked();
        if (checked){
            mySound.start();
        }
        else {
            mySound.pause();
        }
    }

    public void clickExit(View view) {
        mySound.pause();
        finish();
    }
}
