package com.example.ej_spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/*
https://developer.android.com/guide/topics/ui/controls/spinner
 */


public class Spinner6Activity extends Activity {

    private Spinner spinner1, spinner2, spinner3;
    private Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner6);

        spinner1 = (Spinner) findViewById(R.id.spinner1);

		/* Se le asigna al primer spinner el escuchador para cuando se seleciona uno de sus elementos.
		En este caso, se está definiendo el escuchador en otra clase */
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        addItemsOnSpinner2();

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setAdapter(ArrayAdapter.createFromResource(this, R.array.array_paises, android.R.layout.simple_spinner_dropdown_item));

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        addListenerOnButton();

    }

    public void addItemsOnSpinner2() { // Añadimos items dinámicamente al segundo spinner
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("elemento 1");
        arrayList.add("elemento 2");
        arrayList.add("elemento 3");

        // El ArrayAdapter es el intermediario entre el arraylist y el AdapterView (el spinner)
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        arrayList
                );

        spinner2.setAdapter(arrayAdapter);
    }



    public void addListenerOnButton() {
        btnSubmit.setOnClickListener(new OnClickListener() { // Escuchador del evento onClick del botón

            @Override
            public void onClick(View v) {
                Toast.makeText(Spinner6Activity.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()) +
                                "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });

    }

}