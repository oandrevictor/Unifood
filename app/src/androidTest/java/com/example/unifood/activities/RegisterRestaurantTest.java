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
public class RegisterRestaurantTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void registerRestaurantTest() {
        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.sign_up_restaurant_text), withText("Registrar um restaurante."),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatEditText = onView(
                withId(R.id.user_first_name_field));
        appCompatEditText.perform(scrollTo(), replaceText("teste"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                withId(R.id.user_last_name_field));
        appCompatEditText2.perform(scrollTo(), replaceText("Arueira"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                withId(R.id.user_email_field));
        appCompatEditText3.perform(scrollTo(), replaceText("arueira@email.com"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                withId(R.id.user_password_field));
        appCompatEditText4.perform(scrollTo(), replaceText("123456"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                withId(R.id.restaurant_name_field));
        appCompatEditText5.perform(scrollTo(), replaceText("Teste"), closeSoftKeyboard());

        ViewInteraction appCompatEditText6 = onView(
                withId(R.id.restaurant_description));
        appCompatEditText6.perform(scrollTo(), replaceText("ola, eu sou um teste"), closeSoftKeyboard());
//* should use register_campus_spinner - test is compromised
        /*ViewInteraction appCompatMultiAutoCompleteTextView = onView(
                withId(R.id.auto_complete_campus));
        appCompatMultiAutoCompleteTextView.perform(scrollTo(), replaceText("Campina grande"), closeSoftKeyboard());
*/
        ViewInteraction appCompatEditText9 = onView(
                withId(R.id.restaurant_location));
        appCompatEditText9.perform(scrollTo(), replaceText("perto da biblioteca"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.restaurant_sing_up_button), withText("Sign Up")));
        appCompatButton.perform(scrollTo(), click());

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(android.R.id.title), withText("Cardápio"), isDisplayed()));
        appCompatTextView3.perform(click());

        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());

        ViewInteraction appCompatTextView4 = onView(
                allOf(withId(R.id.title), withText("Sair"), isDisplayed()));
        appCompatTextView4.perform(click());

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
