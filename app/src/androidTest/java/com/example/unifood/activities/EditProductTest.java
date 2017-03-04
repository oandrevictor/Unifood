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
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class EditProductTest {

    public final String NEW_DESCRIPTION = "Pao, queijo, hamburguer e ovo";
    public final String PRODUCT_NAME = "X Egg Burg";
    public final String PASSWORD = "olavo123";
    public final String EMAIL = "olavo@gmail.com";
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void editProductTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.email_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText(EMAIL), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.password_field),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText(PASSWORD), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.login_button), withText(R.string.entrar_button),
                        withParent(withId(R.id.fullscreen_content)),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(android.R.id.title), withText(R.string.cardapio_tab), isDisplayed()));
        appCompatTextView.perform(click());

        ViewInteraction appCompatTextView2 = onView(
                allOf(withText(PRODUCT_NAME), isDisplayed()));
        appCompatTextView2.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.product_description_edit), isDisplayed()));
        appCompatEditText4.perform(replaceText(NEW_DESCRIPTION), closeSoftKeyboard());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.update_product_button), withText(R.string.update_product_button), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(android.R.id.title), withText(R.string.cardapio_tab), isDisplayed()));
        appCompatTextView3.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.rest_product_description), withText(NEW_DESCRIPTION),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                        0),
                                2),
                        isDisplayed()));
        textView.check(matches(withText(NEW_DESCRIPTION)));

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
