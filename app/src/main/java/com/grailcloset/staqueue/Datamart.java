package com.grailcloset.staqueue;

import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void addView( View view ) {
        mainPagerAdapter.addView( view, mainPagerAdapter.getCount() );
    }

    public void addView( View view, int location ) {
        mainPagerAdapter.addView( view, location );
    }

    public void pushView( View view ) {
        mainPagerAdapter.addView( view, 0 );
    }

    public void notifyChange() {
        mainPagerAdapter.notifyDataSetChanged();
    }

    public void removeView(View defunctPage) {
        int pageIndex = mainPagerAdapter.removeView( viewPager, defunctPage );
        // You might want to choose what page to display, if the current page was "defunctPage".
        if ( pageIndex == mainPagerAdapter.getCount() ) {
            pageIndex--;
        }
        viewPager.setCurrentItem(pageIndex);
    }

    public View getCurrentPage() {
        return mainPagerAdapter.getView(viewPager.getCurrentItem());
    }

    public void setCurrentPage(View pageToShow) {
        viewPager.setCurrentItem(mainPagerAdapter.getItemPosition(pageToShow), true);
    }
}
