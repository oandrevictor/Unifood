package com.example.unifood.activities;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.unifood.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void loginNotRegisteredTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("teste@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.password_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("12345"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.login_button), withText("Entrar"),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(android.R.id.button1), withText("OK")));
        appCompatButton2.perform(scrollTo(), click());

    }

    @Test
    public void loginStudentTest() {
        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText5.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("teste@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.password_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("123456"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.login_button), withText("Entrar"),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatButton2.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
    }

    @Test
    public void loginRestaurantTest() {
        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText10.perform(click());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText11.perform(replaceText("arueira@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.password_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("123456"), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.login_button), withText("Entrar"),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatTextView5 = onView(
                allOf(withId(android.R.id.title), withText("Cardápio"), isDisplayed()));
        appCompatTextView5.perform(click());
    }
}
