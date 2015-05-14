package com.grailcloset.staqueue;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.webkit.WebView;

/**
 * Created by Oliver on 5/13/2015.
 */
public class MyWebView extends WebView {

    public MyWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        super.onCreateContextMenu(menu);
//        Log.d("catcat", "LONG CLICK BRUH");

        final HitTestResult result = getHitTestResult();
//        Log.d("catcat", result.toString() + ", " + result.getType());
//        Log.d("catcat", HitTestResult.SRC_ANCHOR_TYPE + ", " + result.getExtra());

        MenuItem.OnMenuItemClickListener handler = new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                switch ( item.getItemId() ) {
                    case 1:
                        Datamart.getInstance().addNext(result.getExtra());
                        break;
                    case 2:
                        Datamart.getInstance().addToEnd(result.getExtra());
                        break;
                }
                // do the menu action
                return true;
            }
        };

        if ( result.getType() == HitTestResult.SRC_ANCHOR_TYPE ) {
//            menu.setHeaderTitle("Found a link");
            menu.add(0, 1, 0, "Read next" ).setOnMenuItemClickListener(handler);
            menu.add(0, 2, 0, "Add to queue" ).setOnMenuItemClickListener(handler);
        }

//        if (result.getType() == HitTestResult.IMAGE_TYPE ||
//                result.getType() == HitTestResult.SRC_IMAGE_ANCHOR_TYPE) {
//            // Menu options for an image.
//            //set the header title to the image url
//            menu.setHeaderTitle(result.getExtra());
//            menu.add(0, 1, 0, "Save Image").setOnMenuItemClickListener(handler);
//            menu.add(0, 2, 0, "View Image").setOnMenuItemClickListener(handler);
//        } else if (result.getType() == HitTestResult.ANCHOR_TYPE ||
//                result.getType() == HitTestResult.SRC_ANCHOR_TYPE) {
//            // Menu options for a hyperlink.
//            //set the header title to the link url
//            menu.setHeaderTitle(result.getExtra());
//            menu.add(0, 1, 0, "Save Link").setOnMenuItemClickListener(handler);
//            menu.add(0, 2, 0, "Share Link").setOnMenuItemClickListener(handler);
//        }
    }
}
