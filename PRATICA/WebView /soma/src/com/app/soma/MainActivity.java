package com.app.soma;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.JavascriptInterface;

public class MainActivity extends Activity {
								
								@Override
								protected void onCreate(Bundle savedInstanceState) {
																super.onCreate(savedInstanceState);
																
																WebView view = new WebView(this);
																setContentView(view);
																
																WebSettings config = view.getSettings();
																config.setJavaScriptEnabled(true);
																
																view.addJavascriptInterface(new SomaSimples(), "Android");
																
																view.loadUrl("file:///android_asset/index.html");
								}
								public class SomaSimples {
																@JavascriptInterface
																public int soma(int num1, int num2){
																								return num1+num2;
																}
								}
								
}