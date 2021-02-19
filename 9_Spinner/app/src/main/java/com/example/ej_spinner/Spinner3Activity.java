package com.example.ej_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Spinner3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner3);

        final Spinner spinner = findViewById(R.id.spinner);

        String[] arrayPlanets = new String[] {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno"};

        // El ArrayAdapter es el adaptador que general el listado de elementos a partir del array
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this,
                /* El segundo parámetro es el recurso con el diseño del elemento seleccionado */
                //android.R.layout.simple_list_item_1,
                R.layout.item_guay,
                /* El último parámetro pasa el listado de los elemento a adaptar, en este caso en un array de Strings */
                arrayPlanets);

        // Asignación del recurso de cada elemento cuando se despliega la lista
        arrayAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
                //R.layout.chachi_spinner_item
        );


        // Utilizando un adaptador podemos cargar los elementos dinámicamente en el spinner
        spinner.setAdapter(arrayAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) findViewById(R.id.textViewElection)).setText("Elección: " + parent.getSelectedItem());
                ((TextView) findViewById(R.id.textViewPosition)).setText("Posición: " + parent.getSelectedItemId());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
