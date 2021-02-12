package com.example.ej_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Spinner5Activity extends AppCompatActivity {
    List<String> planetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner5);
        final Spinner spinner = findViewById(R.id.spinner);

        List<String> planetas = new ArrayList<>();
        planetas.add("Mercurio");
        planetas.add("Venus");
        planetas.add("Tierra");
        planetas.add("Marte");
        planetas.add("Júpiter");
        planetas.add("Saturno");
        planetas.add("Urano");
        planetas.add("Neptuno");


        spinner.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                planetas));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) findViewById(R.id.textViewElection))
                        .setText("Elección: " + parent.getSelectedItem());
                ((TextView) findViewById(R.id.textViewPosition))
                        .setText("Posición: " + parent.getSelectedItemId());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}