package com.example.android.riyadhtourguide;

/**
 * Created by ghada on September/4/2017 AD.
 */

public class ListItem {
    private int mName, mDesc, mImg;

    public ListItem(int name, int desc, int img) {
        mName = name;
        mDesc = desc;
        mImg = img;
    }

    public int getName() {
        return mName;
    }

    public int getDesc() {
        return mDesc;
    }

    public int getImg() {
        return mImg;
    }

}