package com.shabiruzzaman_shiam.bice_18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Blood_Group extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood__group);
        webView = findViewById(R.id.blood);


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://docs.google.com/spreadsheets/d/152noAz18aedzZWygXRLozacOJyTQ-Lf5p9PmFDcMvJQ/edit#gid=1055374103");
    }
}
