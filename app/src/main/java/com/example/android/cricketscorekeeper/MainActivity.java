package com.example.android.cricketscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int wicketsTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamA();
    }

    /**
     * Increase the score for Team A by 3 points
     */
    public void scoreThreeTeamA(View v) {
        scoreTeamA += 6;
        displayForTeamA();
    }
    public void scoreThreeTeamB(View v) {
        scoreTeamB += 6;
        displayForTeamB();
    }

    /**
     * Increase the score for Team A by 2 points
     */
    public void scoreTwoTeamA(View v) {
        scoreTeamA += 4;
        displayForTeamA();
    }
    public void scoreTwoTeamB(View v) {
        scoreTeamB += 4;
        displayForTeamB();
    }

    /**
    * Increase the score for Team A by 1 point
    */
    public void scoreOneTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA();
    }
    public void scoreOneTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    public void singleTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA();
    }
    public void singleTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB();
    }

    public void resetScore(View v) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }

    /**
    * This method displays the team's score on screen
    */
    public void displayForTeamA() {
        TextView runsTextView = (TextView) findViewById(R.id.team_a_runs);
        TextView wicketsTextView = (TextView) findViewById(R.id.team_a_wickets);
        runsTextView.setText(String.valueOf(scoreTeamA));
        wicketsTextView.setText(String.valueOf(wicketsTeamA));
     }

     public void displayForTeamB() {
         TextView runsTextView = (TextView) findViewById(R.id.team_b_runs);
         TextView wicketsTextView = (TextView) findViewById(R.id.team_b_wickets);
         runsTextView.setText(String.valueOf(scoreTeamB));
         wicketsTextView.setText(String.valueOf(wicketsTeamB));
     }
}
