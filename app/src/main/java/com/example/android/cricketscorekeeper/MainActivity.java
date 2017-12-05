package com.example.android.cricketscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	/** Class instance variables for team A */
	int scoreTeamA = 0;
	int wicketsTeamA = 0;
	int teamABowler1 = 0;
	int teamABowler2 = 0;
	int teamABowler3 = 0;
	int teamABowler4 = 0;

	/** Class instance variables for team B */
	int scoreTeamB = 0;
	int wicketsTeamB = 0;
	int teamBBowler1 = 0;
	int teamBBowler2 = 0;
	int teamBBowler3 = 0;
	int teamBBowler4 = 0;

	private static final String TEAM_A_SCORE = "scoreTeamA";
	private static final String TEAM_B_SCORE = "scoreTeamB";
	private static final String TEAM_A_WICKETS = "wicketsTeamA";
	private static final String TEAM_B_WICKETS = "wicketsTeamB";
	private static final String TEAM_A_BOWLER_1 = "teamABowler1";
	private static final String TEAM_A_BOWLER_2 = "teamABowler2";
	private static final String TEAM_A_BOWLER_3 = "teamABowler3";
	private static final String TEAM_A_BOWLER_4 = "teamABowler4";
	private static final String TEAM_B_BOWLER_1 = "teamBBowler1";
	private static final String TEAM_B_BOWLER_2 = "teamBBowler2";
	private static final String TEAM_B_BOWLER_3 = "teamBBowler3";
	private static final String TEAM_B_BOWLER_4 = "teamBBowler4";

	/** This app displays an score form to track a cricket match's score */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState != null) {
			scoreTeamA = savedInstanceState.getInt(TEAM_A_SCORE);
			scoreTeamB = savedInstanceState.getInt(TEAM_B_SCORE);

			wicketsTeamA = savedInstanceState.getInt(TEAM_A_WICKETS);
			wicketsTeamB = savedInstanceState.getInt(TEAM_B_WICKETS);

			teamABowler1 = savedInstanceState.getInt(TEAM_A_BOWLER_1);
			teamABowler2 = savedInstanceState.getInt(TEAM_A_BOWLER_2);
			teamABowler3 = savedInstanceState.getInt(TEAM_A_BOWLER_3);
			teamABowler4 = savedInstanceState.getInt(TEAM_A_BOWLER_4);

			teamBBowler1 = savedInstanceState.getInt(TEAM_B_BOWLER_1);
			teamBBowler2 = savedInstanceState.getInt(TEAM_B_BOWLER_2);
			teamBBowler3 = savedInstanceState.getInt(TEAM_B_BOWLER_3);
			teamBBowler4 = savedInstanceState.getInt(TEAM_B_BOWLER_4);
		}

		displayForTeamA();
		displayForTeamB();

		displayForTeamABowler1();
		displayForTeamABowler2();
		displayForTeamABowler3();
		displayForTeamABowler4();

		displayForTeamBBowler1();
		displayForTeamBBowler2();
		displayForTeamBBowler3();
		displayForTeamBBowler4();
	}

	@Override
	protected void onSaveInstanceState(Bundle saveCurrentState) {
		// Score
		saveCurrentState.putInt(TEAM_A_SCORE, scoreTeamA);
		saveCurrentState.putInt(TEAM_B_SCORE, scoreTeamB);

		// Wickets
		saveCurrentState.putInt(TEAM_A_WICKETS, wicketsTeamA);
		saveCurrentState.putInt(TEAM_B_WICKETS, wicketsTeamB);

		// Individual bowler scores
		// Team A
		saveCurrentState.putInt(TEAM_A_BOWLER_1, teamABowler1);
		saveCurrentState.putInt(TEAM_A_BOWLER_2, teamABowler2);
		saveCurrentState.putInt(TEAM_A_BOWLER_3, teamABowler3);
		saveCurrentState.putInt(TEAM_A_BOWLER_4, teamABowler4);

		// Team B
		saveCurrentState.putInt(TEAM_B_BOWLER_1, teamBBowler1);
		saveCurrentState.putInt(TEAM_B_BOWLER_2, teamBBowler2);
		saveCurrentState.putInt(TEAM_B_BOWLER_3, teamBBowler3);
		saveCurrentState.putInt(TEAM_B_BOWLER_4, teamBBowler4);

		super.onSaveInstanceState(saveCurrentState);
	}

	/** This method is invoked when team A's striking batsman hits a sixer (similar to home run) */
	public void sixRunsForTeamA(View v) {
		scoreTeamA += 6;
		displayForTeamA();
	}

	/** This method is invoked when team B's striking batsman a sixer (similar to home run) */
	public void sixRunsForTeamB(View v) {
		scoreTeamB += 6;
		displayForTeamB();
	}

	/**
	 * This method is invoked when team A's striking batsman hits a four.
	 * Four runs is usually scored in a single strike of the bat and the ball goes over the boundary
	 * before pitching at least once.
	 */
	public void fourRunsForTeamA(View v) {
		scoreTeamA += 4;
		displayForTeamA();
	}

	/**
	 * This method is invoked when team B's striking batsman hits a four.
	 * Four runs is usually scored in a single strike of the bat and the ball goes over the boundary
	 * before pitching at least once.
	 */
	public void fourRunsForTeamB(View v) {
		scoreTeamB += 4;
		displayForTeamB();
	}

	/**
	 * This method is invoked when team A's striking batsman runs twice between the wickets
	 * after knocking the ball into the opposite team's non-fielding positions aka between the gaps.
	 */
	public void twoRunsForTeamA(View v) {
		scoreTeamA += 2;
		displayForTeamA();
	}

	/**
	 * This method is invoked when team B's striking batsman runs twice between the wickets
	 * after knocking the ball into the opposite team's non-fielding positions aka between the gaps.
	 */
	public void twoRunsForTeamB(View v) {
		scoreTeamB += 2;
		displayForTeamB();
	}

	/**
	 * This method is invoked when team A's striking batsman runs once between the wickets
	 * after knocking the ball into the opposite team's non-fielding positions aka between the gaps.
	 */
	public void singleRunForTeamA(View v) {
		scoreTeamA += 1;
		displayForTeamA();
	}

	/**
	 * This method is invoked when team B's striking batsman runs once between the wickets
	 * after knocking the ball into the opposite team's non-fielding positions aka between the gaps.
	 */
	public void singleRunForTeamB(View v) {
		scoreTeamB += 1;
		displayForTeamB();
	}

	/**
	 * This method is invoked when bowler 1 from team A gets a wicket of team B.
	 */
	public void teamABowler1Wickets(View v) {
		if (teamABowler4 < 10 && wicketsTeamB < 10) {
			teamABowler1++;
			wicketsTeamB++;
		}
		displayForTeamABowler1();
		displayForTeamB();

	}

	/** This method is invoked when bowler 2 from team A gets a wicket of team B. */
	public void teamABowler2Wickets(View v) {
		if (teamABowler4 < 10 && wicketsTeamB < 10) {
			teamABowler2++;
			wicketsTeamB++;
		}
		displayForTeamABowler2();
		displayForTeamB();

	}

	/** This method is invoked when bowler 3 from team A gets a wicket of team B */
	public void teamABowler3Wickets(View v) {
		if (teamABowler4 < 10 && wicketsTeamB < 10) {
			teamABowler3++;
			wicketsTeamB++;
		}
		displayForTeamABowler3();
		displayForTeamB();

	}

	/** This method is invoked when bowler 4 from team A gets a wicket of team B */
	public void teamABowler4Wickets(View v) {
		if (teamABowler4 < 10 && wicketsTeamB < 10) {
			teamABowler4++;
			wicketsTeamB++;
		}
		displayForTeamABowler4();
		displayForTeamB();

	}

	/** This method is invoked when bowler 1 from team B gets a wicket of team A */
	public void teamBBowler1Wickets(View v) {
		if (teamBBowler1 < 10 && wicketsTeamA < 10) {
			teamBBowler1++;
			wicketsTeamA++;
		}
		displayForTeamBBowler1();
		displayForTeamA();

	}

	/** This method is invoked when bowler 2 from team B gets a wicket of team A */
	public void teamBBowler2Wickets(View v) {
		if (teamBBowler2 < 10 && wicketsTeamA < 10) {
			teamBBowler2++;
			wicketsTeamA++;
		}
		displayForTeamBBowler2();
		displayForTeamA();

	}

	/** This method is invoked when bowler 3 from team B gets a wicket of team A */
	public void teamBBowler3Wickets(View v) {
		if (teamBBowler3 < 10 && wicketsTeamA < 10) {
			teamBBowler3++;
			wicketsTeamA++;
		}
		displayForTeamBBowler3();
		displayForTeamA();
	}

	/** This method is invoked when bowler 4 from team B gets a wicket of team A */
	public void teamBBowler4Wickets(View v) {
		if (teamBBowler4 < 10 && wicketsTeamA < 10) {
			teamBBowler4++;
			wicketsTeamA++;
		}
		displayForTeamBBowler4();
		displayForTeamA();

	}

	/** This method resets the teams' score along with bowlers' wickets summary */
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

	/** This method displays the team A score on screen */
	public void displayForTeamA() {
		TextView runsTextView = findViewById(R.id.team_a_runs);
		TextView wicketsTextView = findViewById(R.id.team_a_wickets);
		runsTextView.setText(String.valueOf(scoreTeamA));
		wicketsTextView.setText(String.valueOf(wicketsTeamA));
	}

	/** This method displays the team B score on screen */
	public void displayForTeamB() {
		TextView runsTextView = findViewById(R.id.team_b_runs);
		TextView wicketsTextView = findViewById(R.id.team_b_wickets);
		runsTextView.setText(String.valueOf(scoreTeamB));
		wicketsTextView.setText(String.valueOf(wicketsTeamB));
	}

	/** This method displays the number of wickets taken by bowler 1 from team A */
	public void displayForTeamABowler1() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_a_bowler_1);
		wicketTakenView.setText(String.valueOf(teamABowler1));
	}

	/** This method displays the number of wickets taken by bowler 2 from team A */
	public void displayForTeamABowler2() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_a_bowler_2);
		wicketTakenView.setText(String.valueOf(teamABowler2));
	}

	/** This method displays the number of wickets taken by bowler 3 from team A */
	public void displayForTeamABowler3() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_a_bowler_3);
		wicketTakenView.setText(String.valueOf(teamABowler3));
	}

	/** This method displays the number of wickets taken by bowler 4 from team A */
	public void displayForTeamABowler4() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_a_bowler_4);
		wicketTakenView.setText(String.valueOf(teamABowler4));
	}

	/** This method displays the number of wickets taken by bowler 1 from team B */
	public void displayForTeamBBowler1() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_b_bowler_1);
		wicketTakenView.setText(String.valueOf(teamBBowler1));
	}

	/** This method displays the number of wickets taken by bowler 2 from team B */
	public void displayForTeamBBowler2() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_b_bowler_2);
		wicketTakenView.setText(String.valueOf(teamBBowler2));
	}

	/** This method displays the number of wickets taken by bowler 3 from team B */
	public void displayForTeamBBowler3() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_b_bowler_3);
		wicketTakenView.setText(String.valueOf(teamBBowler3));
	}

	/** This method displays the number of wickets taken by bowler 4 from team B */
	public void displayForTeamBBowler4() {
		TextView wicketTakenView = findViewById(R.id.wickets_taken_team_b_bowler_4);
		wicketTakenView.setText(String.valueOf(teamBBowler4));
	}
}
