package com.app.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
								
								@Override
								protected void onCreate(Bundle savedInstanceState) {
																super.onCreate(savedInstanceState);
																WebView visualizar = new WebView(this);
																setContentView(visualizar);
																WebSettings configurar = visualizar.getSettings();
																configurar.setJavaScriptEnabled(true);
																visualizar.loadUrl("file:///android_asset/interface.html");
								}
								
}