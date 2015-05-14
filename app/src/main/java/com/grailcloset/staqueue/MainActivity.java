package com.grailcloset.staqueue;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Datamart.getInstance().setMainPagerAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        Datamart.getInstance().addToEnd("http://en.wikipedia.org/wiki/Animal");
        Datamart.getInstance().addToEnd("http://en.wikipedia.org/wiki/Chordate");
        Datamart.getInstance().addToEnd("http://en.wikipedia.org/wiki/Mammal");
        Datamart.getInstance().addToEnd("http://en.wikipedia.org/wiki/Carnivora");
        Datamart.getInstance().addToEnd("http://en.wikipedia.org/wiki/Felidae");
        Datamart.getInstance().addToEnd("http://en.wikipedia.org/wiki/Cat");

        // Set up the ViewPager with the sections adapter.
        Datamart.getInstance().setViewPager( (ViewPager) findViewById(R.id.pager) );
        Datamart.getInstance().getViewPager().setAdapter( Datamart.getInstance().getMainPagerAdapter() );
    }
}
