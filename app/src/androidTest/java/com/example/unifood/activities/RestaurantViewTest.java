package com.example.unifood.activities;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import com.example.unifood.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class RestaurantViewTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void restaurantViewTest() {
        ViewInteraction appCompatEditText = onView(
allOf(withId(R.id.email_field),
withParent(withId(R.id.fullscreen_content)),
isDisplayed()));
        appCompatEditText.perform(replaceText("l"), closeSoftKeyboard());
        
        ViewInteraction appCompatEditText2 = onView(
allOf(withId(R.id.email_field),
withParent(withId(R.id.fullscreen_content)),
isDisplayed()));
        appCompatEditText2.perform(replaceText("l@p.com"), closeSoftKeyboard());
        
        ViewInteraction appCompatEditText3 = onView(
allOf(withId(R.id.password_field),
withParent(withId(R.id.fullscreen_content)),
isDisplayed()));
        appCompatEditText3.perform(replaceText("12345678"), closeSoftKeyboard());
        
        ViewInteraction appCompatButton = onView(
allOf(withId(R.id.login_button), withText("Entrar"),
withParent(withId(R.id.fullscreen_content)),
isDisplayed()));
        appCompatButton.perform(click());
        
        ViewInteraction appCompatTextView = onView(
allOf(withId(android.R.id.title), withText("Todas"), isDisplayed()));
        appCompatTextView.perform(click());
        
        ViewInteraction appCompatTextView2 = onView(
allOf(withId(R.id.restaurant_item_title), withText("Gab Food"), isDisplayed()));
        appCompatTextView2.perform(click());
        
        ViewInteraction appCompatImageButton = onView(
withId(R.id.rest_profile_pic));
        appCompatImageButton.perform(scrollTo(), click());
        
        ViewInteraction textView = onView(
allOf(withId(R.id.rest_profile_name), withText("Gab Food"),
childAtPosition(
allOf(withId(R.id.profile_layout),
childAtPosition(
IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
1)),
0),
isDisplayed()));
        textView.check(matches(withText("Gab Food")));
        
        }

        private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup)parent).getChildAt(position));
            }
        };
    }
    }
