package com.mycompany.myapp4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        texto = findViewById(R.id.texto);
        Button botao = findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					texto.setText("Você clicou no botão!");
				}
			});
    }
}
