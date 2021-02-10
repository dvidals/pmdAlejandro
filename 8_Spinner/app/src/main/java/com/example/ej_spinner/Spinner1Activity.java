package com.example.ej_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Spinner1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner1);
    }

    public void verEleccion(View view) {
        Spinner spinner = findViewById(R.id.spinner);

        ((TextView) findViewById(R.id.textViewElection))
                .setText("Elección: " + spinner.getSelectedItem().toString());
        ((TextView) findViewById(R.id.textViewPosition))
                .setText("Posición: " + spinner.getSelectedItemId());
    }
}
