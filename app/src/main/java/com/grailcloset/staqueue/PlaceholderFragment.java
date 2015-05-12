package com.grailcloset.staqueue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Oliver on 5/11/2015.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String URL_ADDRESS = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(String url) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putString(URL_ADDRESS, url);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textViewURL = (TextView) rootView.findViewById(R.id.textViewURL);
        textViewURL.setText( getArguments().getString( URL_ADDRESS ) );

        Button buttonAddFragment = (Button) rootView.findViewById(R.id.buttonAddFragment);
        buttonAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Datamart.getInstance().getMainPagerAdapter().getFragments().add(PlaceholderFragment.newInstance( "XX" ));
                Datamart.getInstance().getMainPagerAdapter().notifyDataSetChanged();
            }
        });

        return rootView;
    }
}