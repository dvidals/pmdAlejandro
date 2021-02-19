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

public class Spinner6Activity extends Activity {

    private Spinner spinner1, spinner2, spinner3;
    private Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner6);

        spinner1 = (Spinner) findViewById(R.id.spinner61);

		/* Se le asigna al primer spinner el escuchador para cuando se seleciona uno de sus elementos.
		En este caso, se está definiendo el escuchador en otra clase */
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        spinner2 = (Spinner) findViewById(R.id.spinner62);
        addItemsOnSpinner2();

        spinner3 = (Spinner) findViewById(R.id.spinner63);
        spinner3.setAdapter(ArrayAdapter.createFromResource(this, R.array.array_paises, android.R.layout.simple_spinner_dropdown_item));

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        addListenerOnButton();

    }

    private void addItemsOnSpinner2() { // Añadimos items dinámicamente al segundo spinner
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

        arrayAdapter.setDropDownViewResource(R.layout.item_guay);

        spinner2.setAdapter(arrayAdapter);

        /* Seteamos programáticamente un título para el spinner, que se mostrará
        ya que está definido en modo "dialog" */
        spinner2.setPrompt(getResources().getString(R.string.item_prompt));
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