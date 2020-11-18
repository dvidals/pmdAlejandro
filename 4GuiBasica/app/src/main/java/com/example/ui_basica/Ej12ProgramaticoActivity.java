package com.example.ui_basica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Ej12ProgramaticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_ej12_programatico);
        // Se sustituye la linea anterior por las siguientes:

        // se crea un objeto LayoutParams para especificar los parámetros de diseño
        LayoutParams parametros = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        // se crea un objeto LinearLayout como contenedor de todas las vistas
        LinearLayout miLayout = new LinearLayout(this);
        miLayout.setOrientation(LinearLayout.VERTICAL);

        TextView etiqueta1 = new TextView(this);
        etiqueta1.setText("TextView desde código");
        etiqueta1.setLayoutParams(parametros);

        Button boton1 = new Button(this);
        boton1.setText("Botón desde código");
        boton1.setLayoutParams(parametros);

        // Añadir ambas vistas al objeto Layout
        miLayout.addView(etiqueta1);
        miLayout.addView(boton1);

        // Añadir el objeto LinearLayout a la actividad
        setContentView(miLayout,parametros);
        //this.addContentView(miLayout, parametros);
    }
}