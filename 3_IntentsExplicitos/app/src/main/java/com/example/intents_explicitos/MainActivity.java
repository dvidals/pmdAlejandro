/**
 * https://developer.android.com/training/basics/firstapp/starting-activity
 * https://developer.android.com/guide/components/intents-filters
 */

package com.example.intents_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "MESSAGE";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Primer botón (cambia de activity sin pasar datos)
        button = findViewById(R.id.button1);
        // Asignamos un escuchador para cuando se hace click en el botón con id "button1"
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos un intent, su contexto es el objeto de tipo MainActivity que encierra este escuchador
                // y su acción s la inicialización de la clase SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    // Método asociado al 2º Botón:
    public void toSecondActivityWithText(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        EditText editText = (EditText) findViewById(R.id.editText); // Buscamos el EditText
        String message = editText.getText().toString(); // Leemos el string que esté escrito dentro

        intent.putExtra("numero", 42); // Añadimos un valor de tipo int
        intent.putExtra(EXTRA_MESSAGE, message); // Añadimos un String usando una constante como clave

        startActivity(intent);
    }
}