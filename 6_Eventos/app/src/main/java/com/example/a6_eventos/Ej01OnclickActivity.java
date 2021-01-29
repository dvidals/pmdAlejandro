package com.example.a6_eventos;

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
public class Ej01OnclickActivity extends AppCompatActivity {


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
                        Toast.makeText(Ej01OnclickActivity.this, R.string.botton11, Toast.LENGTH_SHORT).show();
                    }
                }
        );

        findViewById(R.id.button12).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Ej01OnclickActivity.this, Ej01SecondActivity.class);

                        // Añadimos al intent el texto que se haya insertado en el editText
                        EditText et12 = findViewById(R.id.et12);
                        String contrasena = et12.getText().toString();
                        intent.putExtra(MENSAJE, contrasena);

                        startActivity(intent);

                    }
                }
        );


    }

/*    public void metodo(View view) {
        Intent intent = new Intent(this, Ej01SecondActivity.class);
        // Añadimos al intent el texto que se haya insertado en el editText
        intent.putExtra(MENSAJE, ((EditText) findViewById(R.id.et12)).getText().toString());
        startActivity(intent);
    }
    */
}