package com.example.toasts_onclick;

import android.view.View;
import android.widget.Toast;

/**
 * Clase que implementa la interfaz OnClickListener, diseñada para poder gestionar eventos de click
 * sobre elementos gráficos
 */
public class MyOnClickListener implements View.OnClickListener {

    @Override  // Esta interfaz obliga a sobreescribir el método onClick que saltará ante el evento de un click sobre el elemento
    public void onClick(View v) {
        Toast.makeText(v.getContext(), R.string.o2_clase_listener, Toast.LENGTH_SHORT).show();
        /* El contexto es el de la actividad, hay que recuperarlo a través de la vista desde
        la que se hace el click. */
    }
}
