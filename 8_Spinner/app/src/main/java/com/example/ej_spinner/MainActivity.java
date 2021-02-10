package com.example.ej_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;


/*
https://developer.android.com/guide/topics/ui/controls/spinner
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Método asociado al evento onClick del botón
     */
    public void toEjemplo(View view) {

        switch (
            /* Se comprueba la posición que está seleccionada en el spinner */
            ((Spinner) findViewById(R.id.main_spinner)).getSelectedItemPosition()
        ) {
            case 0: startActivity(new Intent(this, Spinner1Activity.class)); break;
            case 1: startActivity(new Intent(this, Spinner2Activity.class)); break;
            case 2: startActivity(new Intent(this, Spinner3Activity.class)); break;
            case 3: startActivity(new Intent(this, Spinner4Activity.class)); break;
            case 4: startActivity(new Intent(this, Spinner5Activity.class)); break;
            case 5: startActivity(new Intent(this, Spinner6Activity.class)); break;
        }
    }

}