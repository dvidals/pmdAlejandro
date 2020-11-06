package com.example.a2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1); // Se busca el objeto con id "button1" de la clase autogenerada R (generada a partir de los xml)
        // se asigna al boton un escuchador de tipo OnClickListener; un objeto que indica qué hacer cuando se hace click en el botón
        button.setOnClickListener(
                new View.OnClickListener() { // El escuchador se instancia (new) a partir de una clase anónima
                    @Override // Se sobreescribe el método onclick del escuchador
                    public void onClick(View v) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
                        // Creamos un intent, su contexto es el objeto de tipo MainActivity que encierra este escuchador y sSecondActivity
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                });
    }
}