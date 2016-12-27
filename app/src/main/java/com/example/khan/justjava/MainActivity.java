package com.example.khan.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    //Code for team A
    public void addTwoForTeamA(View view){
        scoreTeamA = scoreTeamA+2;
        displayScoreTeamA(scoreTeamA);
    }
    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA+3;
        displayScoreTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View view){
        scoreTeamA = scoreTeamA+1;
        displayScoreTeamA(scoreTeamA);
    }

    // Code for team B
    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB+2;
        displayScoreTeamB(scoreTeamB);
    }
    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB+3;
        displayScoreTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB+1;
        displayScoreTeamB(scoreTeamB);
    }

    public void scoreReset(View view){
        displayScoreTeamA(0);
        displayScoreTeamB(0);
        scoreTeamA=0;
        scoreTeamB=0;
    }

    // Code to Display Score Team A
    public void displayScoreTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_team_A);
        scoreView.setText(String.valueOf(score));
    }

// Code to Display Score Team B

    public void displayScoreTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_team_B);
        scoreView.setText(String.valueOf(score));
    }
    //Score Reset
}
