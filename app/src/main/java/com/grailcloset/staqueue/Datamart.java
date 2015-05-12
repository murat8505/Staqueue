package com.grailcloset.staqueue;

import android.support.v4.view.ViewPager;

/**
 * Created by Oliver on 5/11/2015.
 */
public class Datamart {

    static Datamart instance;

    private MainPagerAdapter mainPagerAdapter;
    private ViewPager viewPager;

    public Datamart() {

    }

    public static Datamart getInstance() {
        if (instance == null) {
            instance = new Datamart();
        }
        return instance;
    }

    public MainPagerAdapter getMainPagerAdapter() {
        return mainPagerAdapter;
    }

    public void setMainPagerAdapter(MainPagerAdapter mainPagerAdapter) {
        this.mainPagerAdapter = mainPagerAdapter;
    }

    public ViewPager getViewPager() {
        return viewPager;
    }

    public void setViewPager(ViewPager viewPager) {
        this.viewPager = viewPager;
    }
}
