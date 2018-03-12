package com.example.android.riyadhtourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ghada on September/4/2017 AD.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    int pageCOUNT;

    public FragmentAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        this.pageCOUNT = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = new CityFragment();
                break;
            case 1:
                fragment = new FoodFragment();
                break;
            case 2:
                fragment = new HotelsFragment();
                break;
            case 3:
                fragment = new TourFragment();
                break;
            default:
                fragment = new CityFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return pageCOUNT;
    }
}