package com.example.unifood.activities;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.example.unifood.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
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
import static android.support.test.espresso.assertion.ViewAssertions.matches;
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
    public void loginStudentTest() {
        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.sign_up_text), withText("Criar uma conta como estudante."),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatEditText = onView(
                withId(R.id.first_name));
        appCompatEditText.perform(scrollTo(), replaceText("Joao"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                withId(R.id.last_name));
        appCompatEditText2.perform(scrollTo(), replaceText("Pablo"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                withId(R.id.input_email));
        appCompatEditText3.perform(scrollTo(), replaceText("pablo@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                withId(R.id.input_password));
        appCompatEditText4.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_signup), withText("CRIAR CONTA")));
        appCompatButton.perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(R.id.title), withText("Sair"), isDisplayed()));
        appCompatTextView3.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText5.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("pablo@email.com"), closeSoftKeyboard());

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

        ViewInteraction textView = onView(
                allOf(withId(android.R.id.title), withText("Favoritas"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.tabs),
                                        0),
                                0),
                        isDisplayed()));
        textView.check(matches(withText("Favoritas")));
    }

    @Test
    public void loginRestaurantTest() {
        ViewInteraction appCompatTextView5 = onView(
                allOf(withId(R.id.sign_up_restaurant_text), withText("Registrar um restaurante."),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatTextView5.perform(click());

        ViewInteraction appCompatEditText8 = onView(
                withId(R.id.user_first_name_field));
        appCompatEditText8.perform(scrollTo(), replaceText("pab"), closeSoftKeyboard());

        ViewInteraction appCompatEditText9 = onView(
                withId(R.id.user_last_name_field));
        appCompatEditText9.perform(scrollTo(), replaceText("joao"), closeSoftKeyboard());

        ViewInteraction appCompatEditText10 = onView(
                withId(R.id.user_email_field));
        appCompatEditText10.perform(scrollTo(), replaceText("pablito@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText11 = onView(
                withId(R.id.user_password_field));
        appCompatEditText11.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction appCompatEditText12 = onView(
                withId(R.id.restaurant_name_field));
        appCompatEditText12.perform(scrollTo(), replaceText("pao"), closeSoftKeyboard());

        ViewInteraction appCompatEditText13 = onView(
                withId(R.id.restaurant_description));
        appCompatEditText13.perform(scrollTo(), replaceText("pablitos restaurant"), closeSoftKeyboard());

        ViewInteraction appCompatEditText14 = onView(
                withId(R.id.restaurant_location));
        appCompatEditText14.perform(scrollTo(), replaceText("em patos"), closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.restaurant_sing_up_button), withText("Sign Up")));
        appCompatButton3.perform(scrollTo(), click());

        ViewInteraction appCompatEditText15 = onView(
                allOf(withId(R.id.restaurant_location), withText("em patos")));
        appCompatEditText15.perform(scrollTo(), replaceText("em patos gente"), closeSoftKeyboard());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.restaurant_sing_up_button), withText("Sign Up")));
        appCompatButton4.perform(scrollTo(), click());
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
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
