package com.example.a6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Ej06CheckBoxes3Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    boolean jamon = false, queso = false, lechuga = false;
    String stringSandwich = "";
    TextView tvSandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Reutilizamos el Layout definido para la versión anterior
        setContentView(R.layout.activity_ej05_check_boxes2);

        tvSandwich = findViewById(R.id.tvSandwich05);

        CheckBox cbJamon = findViewById(R.id.cbJamon05);
        CheckBox cbQueso = findViewById(R.id.cbQueso05);
        CheckBox cbLechuga = findViewById(R.id.cbLechuga05);

        /* No existe un receptor de eventos como el atributo onClick para OnCheckedChangeListener,
        así que hay que asignárselo desde el código. Si fuese un escuchador creado específicamente
        para una sola vista, se haría con una clase anónima. Sin embargo, en este caso vamos a asignar
        el mismo escuchador a varios
         */
        cbJamon.setOnCheckedChangeListener(this);
        cbQueso.setOnCheckedChangeListener(this);
        cbLechuga.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        // Comprobamos cual de los checkboxes ha sido marcado
        switch (buttonView.getId()) {
            case R.id.cbJamon05:
                if (isChecked) jamon = true;
                else jamon = false;
                break;
            case R.id.cbQueso05:
                if (isChecked) queso = true;
                else queso = false;
                break;
            case R.id.cbLechuga05:
                if (isChecked) lechuga = true;
                else lechuga = false;
                break;
        }

        // Construimos el string

        // Si están los 3 ingredientes:
        if (jamon && queso && lechuga)
            stringSandwich = "Tu sandwich será de jamón, queso y lechuga.";
            // Si no, comprobamos uno por uno:
        else if (jamon) {
            stringSandwich = "Tu sandwich será de jamon";
            if (queso) stringSandwich += " y queso.";
            else if (lechuga) stringSandwich += " y lechuga.";
            else stringSandwich += ".";
        } else if (queso) {
            stringSandwich = "Tu sandwich será de queso";
            if (lechuga) stringSandwich += " y lechuga.";
            else stringSandwich += ".";
        } else if (lechuga) {
            stringSandwich = "Tu sandwich será de lechuga.";
        }
        // Si no hay ninguno, el string queda vacío
        else stringSandwich="";

        // Despues de generar el string adecuado, lo asignamos al textView
        tvSandwich.setText(stringSandwich);
    }

}