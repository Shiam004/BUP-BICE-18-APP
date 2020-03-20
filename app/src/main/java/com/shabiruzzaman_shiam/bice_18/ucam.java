package com.shabiruzzaman_shiam.bice_18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ucam extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucam);

        webView = findViewById(R.id.ucam);


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://webportal.bup.edu.bd/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Ducam-app%26redirect_uri%3Dhttps%253A%252F%252Fucam.bup.edu.bd%26response_mode%3Dform_post%26response_type%3Dcode%2520id_token%26scope%3Dopenid%2520BupUserProfile%26state%3DOpenIdConnect.AuthenticationProperties%253D7b56da96eccc4d8fbb6a8d56528c1799%26nonce%3D87847cd89ad14af7870ad423fd959144");
    }
}
