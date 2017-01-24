// Generated code from Butter Knife. Do not modify!
package com.example.unifood.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class SignUpActivity$$ViewInjector<T extends com.example.unifood.activities.SignUpActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558568, "field 'first_nameText'");
    target.first_nameText = finder.castView(view, 2131558568, "field 'first_nameText'");
    view = finder.findRequiredView(source, 2131558569, "field 'last_nameText'");
    target.last_nameText = finder.castView(view, 2131558569, "field 'last_nameText'");
    view = finder.findRequiredView(source, 2131558570, "field 'universityText'");
    target.universityText = finder.castView(view, 2131558570, "field 'universityText'");
    view = finder.findRequiredView(source, 2131558571, "field 'emailText'");
    target.emailText = finder.castView(view, 2131558571, "field 'emailText'");
    view = finder.findRequiredView(source, 2131558572, "field 'passwordText'");
    target.passwordText = finder.castView(view, 2131558572, "field 'passwordText'");
    view = finder.findRequiredView(source, 2131558573, "field 'signupButton'");
    target.signupButton = finder.castView(view, 2131558573, "field 'signupButton'");
    view = finder.findRequiredView(source, 2131558574, "field 'toLogin'");
    target.toLogin = finder.castView(view, 2131558574, "field 'toLogin'");
  }

  @Override public void reset(T target) {
    target.first_nameText = null;
    target.last_nameText = null;
    target.universityText = null;
    target.emailText = null;
    target.passwordText = null;
    target.signupButton = null;
    target.toLogin = null;
  }
}
