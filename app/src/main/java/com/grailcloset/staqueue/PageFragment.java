package com.grailcloset.staqueue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by Oliver on 5/11/2015.
 */
public class PageFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String URL_ADDRESS = "url_address";
    private String URL;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PageFragment newInstance(String url) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putString(URL_ADDRESS, url);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        URL = getArguments().getString(URL_ADDRESS);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

//        TextView textViewURL = (TextView) rootView.findViewById(R.id.textViewURL);
//        textViewURL.setText(URL);

        MyWebView webView = (MyWebView) rootView.findViewById(R.id.webView);

        getActivity().registerForContextMenu(webView);
        webView.setWebViewClient(new WebViewClient());

        webView.setLongClickable(true);
        webView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl(URL);


//        Button buttonAddFragment = (Button) rootView.findViewById(R.id.buttonAddFragment);
//        buttonAddFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Datamart.getInstance().getMainPagerAdapter().getFragments().add(PageFragment.newInstance(URL));
//                Datamart.getInstance().getMainPagerAdapter().notifyDataSetChanged();
//            }
//        });

        return rootView;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}