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
import static android.support.test.espresso.Espresso.pressBack;
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
public class DeleteRestaurantAccountTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void deleteRestaurantAccountTest() {
        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.sign_up_restaurant_text), withText("Registrar um restaurante."),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatEditText8 = onView(
                withId(R.id.user_first_name_field));
        appCompatEditText8.perform(scrollTo(), replaceText("pab"), closeSoftKeyboard());

        ViewInteraction appCompatEditText9 = onView(
                withId(R.id.user_last_name_field));
        appCompatEditText9.perform(scrollTo(), replaceText("jo lanches"), closeSoftKeyboard());

        ViewInteraction appCompatEditText10 = onView(
                withId(R.id.user_email_field));
        appCompatEditText10.perform(scrollTo(), replaceText("jo@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText11 = onView(
                withId(R.id.user_password_field));
        appCompatEditText11.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction appCompatEditText13 = onView(
                withId(R.id.restaurant_description));
        appCompatEditText13.perform(scrollTo(), replaceText("joe lanches"), closeSoftKeyboard());

        ViewInteraction appCompatEditText14 = onView(
                withId(R.id.restaurant_location));
        appCompatEditText14.perform(scrollTo(), replaceText("bla bla bla bla bla"), closeSoftKeyboard());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.restaurant_sing_up_button), withText("Sign Up")));
        appCompatButton7.perform(scrollTo(), click());

        ViewInteraction appCompatEditText15 = onView(
                allOf(withId(R.id.user_last_name_field), withText("jo")));
        appCompatEditText15.perform(scrollTo(), replaceText("joen"), closeSoftKeyboard());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.restaurant_sing_up_button), withText("Sign Up")));
        appCompatButton8.perform(scrollTo(), click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction appCompatTextView2 = onView(
                allOf(withId(R.id.title), withText("Deletar conta"), isDisplayed()));
        appCompatTextView2.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(android.R.id.button1), withText("Sim")));
        appCompatButton9.perform(scrollTo(), click());

    }

}
