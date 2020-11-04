package com.example.a2_guibasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // método asociado al evento onclick del botón con nombre "LinearLayout"
    public void toEj1LinearLayout(View view) {
        // Creamos un intent explícito que especifica el paso a la actividad "Ej1LinearLayout"
        Intent intent = new Intent(this, Ej1LinearLayout.class);
        //Pasamos a la nueva activit
        startActivity(intent);
    }

    public void toIntentsExplicitos(View view) {
        startActivity(new Intent(this, Ej2IntentsExplicitos.class));
    }
}