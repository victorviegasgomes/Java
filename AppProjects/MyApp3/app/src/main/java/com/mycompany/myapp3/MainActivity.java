package com.mycompany.myapp3;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	Button btn;
	TextView txt_res;
	TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		txt = findViewById(R.id.txt);
		txt.setText("olá, mundo");
		btn = findViewById(R.id.btn);
		txt_res = findViewById(R.id.txt_res);
		//mensagem();
    }
	public void mensagem() {
		txt_res.setText("você clicou no botão");
	}
}
