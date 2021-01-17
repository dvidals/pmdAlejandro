package com.example.a6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.a6_eventos.Ej01OnclickActivity.MENSAJE;

public class Ej01SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej1_second);

        String mensaje = getIntent().getStringExtra(MENSAJE);

        TextView tv= findViewById(R.id.tv12);

        tv.setText(mensaje);

        // En una línea:
        // ((TextView) findViewById(R.id.tv12)).setText(getIntent().getStringExtra(MENSAJE));
    }
}