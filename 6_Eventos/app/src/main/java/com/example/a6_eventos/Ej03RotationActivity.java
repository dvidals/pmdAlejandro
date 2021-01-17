package com.example.a6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ej03RotationActivity extends AppCompatActivity {
    TextView tv31, tv32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej03_rotation);

        tv31 = findViewById(R.id.tv31);
        tv32 = findViewById(R.id.tv32);
    }

    public void mostrarTextoRotado(View view) {
        tv31.setVisibility(View.GONE);
        tv32.setVisibility(View.VISIBLE);
    }

    /**
     * Añade una rotación de 25º a la rotación ya presente
     */
    public void rotar(View view) {
        tv32.setRotation(tv32.getRotation()+25);
    }
}