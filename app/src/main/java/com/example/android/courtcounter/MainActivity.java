package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

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
        scoreTeamA += 3;
        displayForTeamA();
    }
    public void scoreThreeTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB();
    }

    /**
     * Increase the score for Team A by 2 points
     */
    public void scoreTwoTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA();
    }
    public void scoreTwoTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    /**
    * Increase the score for Team A by 1 point
    */
    public void scoreOneTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA();
    }
    public void scoreOneTeamB(View v) {
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
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText(String.valueOf(scoreTeamA));
     }

     public void displayForTeamB() {
         TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
         scoreTextView.setText(String.valueOf(scoreTeamB));
     }
}
