package com.grailcloset.staqueue;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Oliver on 5/11/2015.
 */
class MainPagerAdapter extends FragmentPagerAdapter {


    private ArrayList<PageFragment> fragments = new ArrayList<PageFragment>();


    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public PageFragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public ArrayList<PageFragment> getFragments() {
        return fragments;
    }

    public void setFragments(ArrayList<PageFragment> fragments) {
        this.fragments = fragments;
    }
}

