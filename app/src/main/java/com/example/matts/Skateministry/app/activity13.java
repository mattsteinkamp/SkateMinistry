package com.example.matts.Skateministry.app;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;



public class activity13 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page13);
        WebView webView = (WebView)
                findViewById(R.id.webView);
        webView.loadUrl("https://www.youtube.com/watch?v=ilVCnjILIb4");
    }
}