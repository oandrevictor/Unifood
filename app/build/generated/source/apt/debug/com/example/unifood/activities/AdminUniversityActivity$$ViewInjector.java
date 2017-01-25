// Generated code from Butter Knife. Do not modify!
package com.example.unifood.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class AdminUniversityActivity$$ViewInjector<T extends com.example.unifood.activities.AdminUniversityActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558547, "field 'name'");
    target.name = finder.castView(view, 2131558547, "field 'name'");
    view = finder.findRequiredView(source, 2131558549, "field 'campusname'");
    target.campusname = finder.castView(view, 2131558549, "field 'campusname'");
    view = finder.findRequiredView(source, 2131558550, "field 'createButton'");
    target.createButton = finder.castView(view, 2131558550, "field 'createButton'");
  }

  @Override public void reset(T target) {
    target.name = null;
    target.campusname = null;
    target.createButton = null;
  }
}
