package com.example.android.cricketscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int wicketsTeamA = 0;
    int teamABowler1 = 0;
    int teamABowler2 = 0;
    int teamABowler3 = 0;
    int teamABowler4 = 0;

    int scoreTeamB = 0;
    int wicketsTeamB = 0;
    int teamBBowler1 = 0;
    int teamBBowler2 = 0;
    int teamBBowler3 = 0;
    int teamBBowler4 = 0;

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
    public void sixRunsForTeamA(View v) {
        scoreTeamA += 6;
        displayForTeamA();
    }

    public void sixRunsForTeamB(View v) {
        scoreTeamB += 6;
        displayForTeamB();
    }

    /**
     * Increase the score for Team A by 2 points
     */
    public void fourRunsForTeamA(View v) {
        scoreTeamA += 4;
        displayForTeamA();
    }

    public void fourRunsForTeamB(View v) {
        scoreTeamB += 4;
        displayForTeamB();
    }

    /**
     * Increase the score for Team A by 1 point
     */
    public void twoRunsForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA();
    }

    public void twoRunsForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB();
    }

    public void singleRunForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA();
    }

    public void singleRunForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB();
    }

    public void teamABowler1Wickets(View v) {
        if (teamABowler4 < 10 && wicketsTeamB < 10) {
            teamABowler1++;
            wicketsTeamB++;
        }
        displayForTeamABowler1();
        displayForTeamB();

    }

    public void teamABowler2Wickets(View v) {
        if (teamABowler4 < 10 && wicketsTeamB < 10) {
            teamABowler2++;
            wicketsTeamB++;
        }
        displayForTeamABowler2();
        displayForTeamB();

    }

    public void teamABowler3Wickets(View v) {
        if (teamABowler4 < 10 && wicketsTeamB < 10) {
            teamABowler3++;
            wicketsTeamB++;
        }
        displayForTeamABowler3();
        displayForTeamB();

    }

    public void teamABowler4Wickets(View v) {
        if (teamABowler4 < 10 && wicketsTeamB < 10) {
            teamABowler4++;
            wicketsTeamB++;
        }
        displayForTeamABowler4();
        displayForTeamB();

    }

    public void teamBBowler1Wickets(View v) {
        if (teamBBowler1 < 10 && wicketsTeamA < 10) {
            teamBBowler1++;
            wicketsTeamA++;
        }
        displayForTeamBBowler1();
        displayForTeamA();

    }

    public void teamBBowler2Wickets(View v) {
        if (teamBBowler2 < 10 && wicketsTeamA < 10) {
            teamBBowler2++;
            wicketsTeamA++;
        }
        displayForTeamBBowler2();
        displayForTeamA();

    }

    public void teamBBowler3Wickets(View v) {
        if (teamBBowler3 < 10 && wicketsTeamA < 10) {
            teamBBowler3++;
            wicketsTeamA++;
        }
        displayForTeamBBowler3();
        displayForTeamA();

    }

    public void teamBBowler4Wickets(View v) {
        if (teamBBowler4 < 10 && wicketsTeamA < 10) {
            teamBBowler4++;
            wicketsTeamA++;
        }
        displayForTeamBBowler4();
        displayForTeamA();

    }

    public void resetScore(View v) {
        teamABowler1 = teamABowler2 = teamABowler3 = teamABowler4 = 0;
        teamBBowler1 = teamBBowler2 = teamBBowler3 = teamBBowler4 = 0;
        scoreTeamA = scoreTeamB = 0;
        wicketsTeamA = wicketsTeamB = 0;
        displayForTeamABowler1();
        displayForTeamABowler2();
        displayForTeamABowler3();
        displayForTeamABowler4();
        displayForTeamBBowler1();
        displayForTeamBBowler2();
        displayForTeamBBowler3();
        displayForTeamBBowler4();
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

    public void displayForTeamABowler1() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_a_bowler_1);
        wicketTakenView.setText(String.valueOf(teamABowler1));
    }

    public void displayForTeamABowler2() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_a_bowler_2);
        wicketTakenView.setText(String.valueOf(teamABowler2));
    }

    public void displayForTeamABowler3() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_a_bowler_3);
        wicketTakenView.setText(String.valueOf(teamABowler3));
    }

    public void displayForTeamABowler4() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_a_bowler_4);
        wicketTakenView.setText(String.valueOf(teamABowler4));
    }

    public void displayForTeamBBowler1() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_b_bowler_1);
        wicketTakenView.setText(String.valueOf(teamBBowler1));
    }

    public void displayForTeamBBowler2() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_b_bowler_2);
        wicketTakenView.setText(String.valueOf(teamBBowler2));
    }

    public void displayForTeamBBowler3() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_b_bowler_3);
        wicketTakenView.setText(String.valueOf(teamBBowler3));
    }

    public void displayForTeamBBowler4() {
        TextView wicketTakenView = (TextView) findViewById(R.id.wickets_taken_team_b_bowler_4);
        wicketTakenView.setText(String.valueOf(teamBBowler4));
    }
}
