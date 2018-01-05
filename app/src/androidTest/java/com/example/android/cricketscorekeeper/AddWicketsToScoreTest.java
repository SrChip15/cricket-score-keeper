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
public class AddWicketsToScoreTest {
	@Rule
	public ActivityTestRule<MainActivity> mActivityTestRule =
			new ActivityTestRule<>(MainActivity.class);

	@Test
	public void clickAnyBowler_ChangeScore() {
		// Bowler 1's wickets update score and individual stat
		onView(withId(R.id.bowler1TeamA)).perform(click());
		onView(withId(R.id.wickets_taken_team_a_bowler_1)).check(matches(withText("1")));
		onView(withId(R.id.team_b_wickets)).check(matches(withText("1")));
		onView(withId(R.id.bowler1TeamB)).perform(click());
		onView(withId(R.id.wickets_taken_team_b_bowler_1)).check(matches(withText("1")));
		onView(withId(R.id.team_a_wickets)).check(matches(withText("1")));

		// Bowler 2's wickets update score and individual stat
		onView(withId(R.id.bowler2TeamA)).perform(click());
		onView(withId(R.id.wickets_taken_team_a_bowler_2)).check(matches(withText("1")));
		onView(withId(R.id.team_b_wickets)).check(matches(withText("2"))); // 1 + 1
		onView(withId(R.id.bowler2TeamB)).perform(click());
		onView(withId(R.id.wickets_taken_team_b_bowler_2)).check(matches(withText("1")));
		onView(withId(R.id.team_a_wickets)).check(matches(withText("2"))); // 1 + 1

		// Bowler 3's wickets update score and individual stat
		onView(withId(R.id.bowler3TeamA)).perform(click());
		onView(withId(R.id.wickets_taken_team_a_bowler_3)).check(matches(withText("1")));
		onView(withId(R.id.team_b_wickets)).check(matches(withText("3"))); // 1 + 1 + 1
		onView(withId(R.id.bowler3TeamB)).perform(click());
		onView(withId(R.id.wickets_taken_team_b_bowler_3)).check(matches(withText("1")));
		onView(withId(R.id.team_a_wickets)).check(matches(withText("3"))); // 1 + 1 + 1

		// Bowler 4's wickets update score and individual stat
		onView(withId(R.id.bowler4TeamA)).perform(click());
		onView(withId(R.id.wickets_taken_team_a_bowler_4)).check(matches(withText("1")));
		onView(withId(R.id.team_b_wickets)).check(matches(withText("4"))); // 1 + 1 + 1 + 1
		onView(withId(R.id.bowler4TeamB)).perform(click());
		onView(withId(R.id.wickets_taken_team_b_bowler_4)).check(matches(withText("1")));
		onView(withId(R.id.team_a_wickets)).check(matches(withText("4"))); // 1 + 1 + 1 + 1
	}
}
