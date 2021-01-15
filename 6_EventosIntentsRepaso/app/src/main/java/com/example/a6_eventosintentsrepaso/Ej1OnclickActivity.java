package com.example.a6_eventosintentsrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Ejemplo ampliando lo explicado en "2_ToastsOnClick" y en "3_IntentsExplicitos"
 */
public class Ej1OnclickActivity extends AppCompatActivity {


    static final String MENSAJE = "MensajeEnviado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1_onclick);

        Button btn11 = findViewById(R.id.button11);
        btn11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Ej1OnclickActivity.this, R.string.botton11, Toast.LENGTH_SHORT).show();
                    }
                }
        );

        findViewById(R.id.button12).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Ej1OnclickActivity.this, Ej1SecondActivity.class);
                        // Añadimos al intent el texto que se haya insertado en el editText
                        intent.putExtra(MENSAJE, ((EditText) findViewById(R.id.et12)).getText().toString());
                        startActivity(intent);

                    }
                }
        );


    }

    public void metodo(View view) {
        Intent intent = new Intent(this, Ej1SecondActivity.class);
        // Añadimos al intent el texto que se haya insertado en el editText
        intent.putExtra(MENSAJE, ((EditText) findViewById(R.id.et12)).getText().toString());
        startActivity(intent);
    }
}