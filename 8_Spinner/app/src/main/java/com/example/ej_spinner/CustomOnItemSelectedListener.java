package com.example.ej_spinner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;

/*
https://developer.android.com/reference/android/widget/AdapterView.OnItemSelectedListener
 */
public class CustomOnItemSelectedListener implements OnItemSelectedListener {


    /**
     * Método de callback al que se invoca cuando se selecciona un elemento de un listado (el spinner1, en este caso)
     *
     * @param adapterView Vista que contiene los elementos, en este caso, el spinner.
     *                    (spinner es una de las clases que heredan de AdapterView: clases que utilizan adaptadores.
     *                    En general, se trata de views consistententes en listados de elementos)
     * @param view        Vista concreta del elemento (el elemento TextView que se pulsa dentro del spinner.
     * @param posicion    la posición del elemento en el adaptador
     * @param id          la id de la fila seleccionada
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int posicion, long id) {
        Toast.makeText(adapterView.getContext(),
                "OnItemSelectedListener:\n"
                        + adapterView.getItemAtPosition(posicion).toString()
                        + "\n" + ((TextView) view).getText().toString(), // Dos modos de hacer lo mismo
        Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }

}