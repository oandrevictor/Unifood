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
public class AddFavTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void addFavTest() {
        ViewInteraction appCompatEditText = onView(
allOf(withId(R.id.email_field),
withParent(withId(R.id.fullscreen_content)),
isDisplayed()));
        appCompatEditText.perform(replaceText("l@p.com"), closeSoftKeyboard());
        
        ViewInteraction appCompatEditText2 = onView(
allOf(withId(R.id.password_field),
withParent(withId(R.id.fullscreen_content)),
isDisplayed()));
        appCompatEditText2.perform(replaceText("12345678"), closeSoftKeyboard());
        
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
        
        ViewInteraction imageButton = onView(
allOf(withId(R.id.favButton),
childAtPosition(
allOf(withId(R.id.restaurant_host_bar),
childAtPosition(
IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
0)),
1),
isDisplayed()));
        imageButton.check(matches(isDisplayed()));
        
        ViewInteraction floatingActionButton = onView(
allOf(withId(R.id.favButton),
withParent(withId(R.id.restaurant_host_bar)),
isDisplayed()));
        floatingActionButton.perform(click());
        
        ViewInteraction floatingActionButton2 = onView(
allOf(withId(R.id.favButton),
withParent(withId(R.id.restaurant_host_bar)),
isDisplayed()));
        floatingActionButton2.perform(click());
        
        ViewInteraction textView = onView(
allOf(withId(android.R.id.message), withText("O restaurante já está na sua lista de favoritos. Deseja remove-lo?"),
childAtPosition(
childAtPosition(
withId(R.id.scrollView),
0),
0),
isDisplayed()));
        textView.check(matches(withText("O restaurante já está na sua lista de favoritos. Deseja remove-lo?")));
        
        ViewInteraction appCompatButton2 = onView(
allOf(withId(android.R.id.button2), withText("Não")));
        appCompatButton2.perform(scrollTo(), click());
        
        ViewInteraction appCompatTextView3 = onView(
allOf(withId(android.R.id.title), withText("Perfil"), isDisplayed()));
        appCompatTextView3.perform(click());
        
        pressBack();
        
        ViewInteraction appCompatTextView4 = onView(
allOf(withId(android.R.id.title), withText("Favoritas"), isDisplayed()));
        appCompatTextView4.perform(click());
        
        ViewInteraction textView2 = onView(
allOf(withId(R.id.restaurant_item_title), withText("Gab Food"),
childAtPosition(
childAtPosition(
IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
0),
0),
isDisplayed()));
        textView2.check(matches(withText("Gab Food")));
        
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
