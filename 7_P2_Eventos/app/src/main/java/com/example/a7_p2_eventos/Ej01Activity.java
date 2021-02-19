package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ej01Activity extends AppCompatActivity {

    private String frase;
    private int contador=0;

    TextView tv_haspulsado;
    Button btn01limpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej01);

        tv_haspulsado = findViewById(R.id.tv_haspulsado);
        btn01limpiar = findViewById(R.id.btn01limpiar);
    }

    public void cuenta01(View view) {
        contador++;
        if (contador==1) frase = "Has pulsado 1 vez";
        else if (contador>1) frase = "Has pulsado "+ contador + " veces";

        tv_haspulsado.setText(frase);
        tv_haspulsado.setVisibility(View.VISIBLE);

        btn01limpiar.setVisibility(View.VISIBLE);
    }

    public void limpiar(View view) {
        contador=0;
        tv_haspulsado.setVisibility(View.INVISIBLE);
        btn01limpiar.setVisibility(View.INVISIBLE);
    }

}