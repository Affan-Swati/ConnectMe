package com.affan.i220916

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BackButtonTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(profile_tab::class.java)

    @Test
    fun testBackButton() {
        onView(withId(R.id.following_btn)).perform(click())

        onView(withId(R.id.back_button)).perform(click())

        onView(withId(R.id.profile_info)).check(matches(isDisplayed()))
    }
}