package com.example.toasts_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast; // Un Toast es una notificación básica (https://developer.android.com/guide/topics/ui/notifiers/toasts)

public class MainActivity extends AppCompatActivity {


    // 1. Receptor de eventos

    // Método asociado al TextView a través del atributo android:onClick
    public void click1(View view) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
        // El contexto es this, ya que al pertenecer el método click1 a la Activity, el objeto de la actividad es el contexto
        Toast.makeText(this, "Receptor de eventos", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 2. Creación de clase que implemente el listener (es raro hacerlo así, solo tendría sentido si ese listener se reutilizase.

        Button button1 = findViewById(R.id.button1); // Se busca el objeto con id "button1" de la clase autogenerada R (generada a partir de los xml)
        // se asigna al boton un escuchador de tipo OnClickListener; un objeto que indica qué hacer cuando se hace click en el botón
        button1.setOnClickListener(new MyOnClickListener()); // Se asigna un objeto anónimo de la clase MyOnClickListener


        // 3. Implementación usando una clase anónima.

        Button button2 = findViewById(R.id.button2);
        // El escuchador se instancia (new) a partir de una clase anónima
        button2.setOnClickListener(
                new View.OnClickListener() {  // El escuchador se instancia (new) a partir de una clase anónima
                    @Override  // Se sobreescribe el método onclick del escuchador
                    public void onClick(View v) { // el método recibe como parámetro la View sobre la que se hizo el click (el botón)
                        Toast.makeText(MainActivity.this, R.string.o3_clase_anonima, Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }

}