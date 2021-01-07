package com.example.ui_basica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Ej09BasicosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej09_basicos);
    }

    // Método asociado al evento onClick en los dos botones que ponen "BOTÓN".
    public void muestraNuevoElemento(View view) {

        // Creación de un elemento programáticamente

        // Crear una instancia de la clase TextView
        TextView etiqueta1 = new TextView(this);
        // Establecemos el valor del string
        etiqueta1.setText("TextView desde código");
        // Modificamos aspecto
        etiqueta1.setTextSize(25);
        etiqueta1.setTextColor(0xFFFF0000); // El "0x" indica que el número que sigue está en hexadecimal
        // Colocamos la vista TextView en el FrameLayout
        ((FrameLayout) findViewById(R.id.frame)).addView(etiqueta1);

    }

}