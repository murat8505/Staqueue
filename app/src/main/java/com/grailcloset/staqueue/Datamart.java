package com.grailcloset.staqueue;

import android.support.v4.view.ViewPager;
import android.util.Log;

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

    public void addToEnd( String URL ) {
        mainPagerAdapter.getFragments().add(PageFragment.newInstance(URL));
        mainPagerAdapter.notifyDataSetChanged();
    }

    public void addNext( String URL ) {
//        mainPagerAdapter.getFragments().add(PageFragment.newInstance(mainPagerAdapter.getItem(mainPagerAdapter.getCount() - 1).getURL()));
//
//        for ( int i = viewPager.getCurrentItem() + 2; i < mainPagerAdapter.getFragments().size() - 1; i ++ ) {
//            mainPagerAdapter.getFragments().set(i, mainPagerAdapter.getItem(i - 1));
//        }

        mainPagerAdapter.getFragments().set(viewPager.getCurrentItem() + 1, PageFragment.newInstance(URL));

        mainPagerAdapter.notifyDataSetChanged();


//        mainPagerAdapter.getFragments().add(viewPager.getCurrentItem() + 1, PageFragment.newInstance(URL));
//        mainPagerAdapter.notifyDataSetChanged();
//        String temp =

//        for ( int i = viewPager.getCurrentItem() + 1; i < mainPagerAdapter.getFragments().size(); i++ ) {
//            Log.d("catcat", "new tag _ " + mainPagerAdapter.getFragments().get(i).getTag() );
//            mainPagerAdapter.getFragments().get(i).
//            viewPager.setAdapter(mainPagerAdapter);
//        }


//        mainPagerAdapter.getFragments().add(0, PageFragment.newInstance(URL));
//        viewPager.refreshDrawableState();
//        mainPagerAdapter.notifyDataSetChanged();
    }
}
