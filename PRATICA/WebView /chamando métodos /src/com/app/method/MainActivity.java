package com.app.method;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Adiciona a interface Java para o JavaScript
        webView.addJavascriptInterface(new WebAppInterface(this), "Android");

        // Carrega uma página HTML com JavaScript
        webView.loadUrl("file:///android_asset/index.html");
    }
								public class WebAppInterface {
    												Context mContext;

    												WebAppInterface(Context context) {
        																mContext = context;
    												}
																@JavascriptInterface
    												public void showToast(String message) {
        																Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    												}
								}
}