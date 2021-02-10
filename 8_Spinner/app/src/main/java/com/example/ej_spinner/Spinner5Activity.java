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

public class Spinner5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner5);
        final Spinner spinner = findViewById(R.id.spinner);

        ArrayList<String> planetos = new ArrayList<>();
        planetos.add("Mercurio");
        planetos.add("Venus");
        planetos.add("Tierra");
        planetos.add("Marte");
        planetos.add("Júpiter");
        planetos.add("Saturno");
        planetos.add("Urano");
        planetos.add("Neptuno");

        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, planetos));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) findViewById(R.id.textViewElection)).setText("Elección: " + spinner.getSelectedItem());
                ((TextView) findViewById(R.id.textViewPosition)).setText("Posición: " + spinner.getSelectedItemId());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}