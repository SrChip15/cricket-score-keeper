package com.example.android.cricketscorekeeper;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class AddRunsToScoreTest {
	@Rule
	public ActivityTestRule<MainActivity> mActivityTestRule =
			new ActivityTestRule<>(MainActivity.class);

	@Test
	public void clickSixRuns_ChangeScore() {
		// Check whether 6 runs are added to team's score
		onView(withId(R.id.scoreSixRunsTeamA)).perform(click()); // Click Team A's sixes button
		onView(withId(R.id.team_a_runs)).check(matches(withText("6")));
		onView(withId(R.id.scoreSixRunsTeamB)).perform(click()); // Click Team B's sixes button
		onView(withId(R.id.team_b_runs)).check(matches(withText("6")));

		// Check whether 4 runs are added to team's score
		onView(withId(R.id.scoreFourRunsTeamA)).perform(click());
		onView(withId(R.id.team_a_runs)).check(matches(withText("10"))); // 6 + 4
		onView(withId(R.id.scoreFourRunsTeamB)).perform(click());
		onView(withId(R.id.team_b_runs)).check(matches(withText("10")));

		// Check whether 2 runs are added to team's score
		onView(withId(R.id.scoreDoublesTeamA)).perform(click());
		onView(withId(R.id.team_a_runs)).check(matches(withText("12"))); // 6 + 4 + 2
		onView(withId(R.id.scoreDoublesTeamB)).perform(click());
		onView(withId(R.id.team_b_runs)).check(matches(withText("12")));

		// Check whether 1 run is added to team's score
		onView(withId(R.id.scoreSinglesTeamA)).perform(click());
		onView(withId(R.id.team_a_runs)).check(matches(withText("13"))); // 6 + 4 + 2 + 1
		onView(withId(R.id.scoreSinglesTeamB)).perform(click());
		onView(withId(R.id.team_b_runs)).check(matches(withText("13")));
	}
}
