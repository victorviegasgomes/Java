package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	Button btnClick;
	TextView resultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		btnClick = findViewById(R.id.btnClick);
		resultado = findViewById(R.id.res);
    }
	
	public void clicarNoBotao(View v) {
		resultado.setText("Você clicou no botão, parabéns seu miserável");
	}
}
