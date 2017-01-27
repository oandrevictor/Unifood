package com.example.unifood.activities.helpers;

/**
 * Created by Rafaela Araújo on 27/01/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.unifood.activities.RestaurantHomeFragment;
import com.example.unifood.activities.RestaurantProfileFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new RestaurantHomeFragment();
            case 1:
                // Games fragment activity
                return new RestaurantProfileFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
}