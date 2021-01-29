package com.example.a6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Ej05CheckBoxes2Activity extends AppCompatActivity {
    boolean jamon = false, queso = false, lechuga = false;
    String stringSandwich = "";
    TextView tvSandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej05_check_boxes2);

        tvSandwich = findViewById(R.id.tvSandwich05);

        CheckBox cbJamon = findViewById(R.id.cbJamon05);
        CheckBox cbQueso = findViewById(R.id.cbQueso05);
        CheckBox cbLechuga = findViewById(R.id.cbLechuga05);

        /* No existe un receptor de eventos como el atributo onClick para OnCheckedChangeListener,
        así que hay que asignárselo desde el código. Los asignamos mediante clases anónimas */

        cbJamon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) jamon = true;
                else jamon = false;

                actualizaSandwich();
            }
        });

        cbQueso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) queso = true;
                else queso = false;
                actualizaSandwich();
            }
        });

        cbLechuga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) lechuga = true;
                else lechuga = false;
                actualizaSandwich();
            }
        });

    }

    public void actualizaSandwich() {

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
        else stringSandwich = "";

        // Despues de generar el string adecuado, lo asignamos al textView
        tvSandwich.setText(stringSandwich);
    }

}