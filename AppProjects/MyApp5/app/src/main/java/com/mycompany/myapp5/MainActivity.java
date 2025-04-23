package com.mycompany.myapp5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText numero1, numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);

        Button botaoSoma = findViewById(R.id.botaoSoma);
        Button botaoSubtracao = findViewById(R.id.botaoSubtracao);
        Button botaoMultiplicacao = findViewById(R.id.botaoMultiplicacao);
        Button botaoDivisao = findViewById(R.id.botaoDivisao);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					calcular('+');
				}
			});

        botaoSubtracao.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					calcular('-');
				}
			});

        botaoMultiplicacao.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					calcular('*');
				}
			});

        botaoDivisao.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					calcular('/');
				}
			});
    }

    private void calcular(char operador) {
        String texto1 = numero1.getText().toString();
        String texto2 = numero2.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            resultado.setText("Por favor, preencha ambos os números.");
            return;
        }

        double num1 = Double.parseDouble(texto1);
        double num2 = Double.parseDouble(texto2);
        double res = 0;

        switch (operador) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    resultado.setText("Erro: Divisão por zero.");
                    return;
                }
                res = num1 / num2;
                break;
        }

        resultado.setText("Resultado: " + res);
    }
}
