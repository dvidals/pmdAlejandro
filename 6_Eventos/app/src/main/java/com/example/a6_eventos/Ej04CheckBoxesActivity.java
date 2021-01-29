package com.example.a6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

// https://developer.android.com/guide/topics/ui/controls/checkbox

public class Ej04CheckBoxesActivity extends AppCompatActivity {
    boolean jamon = false, queso = false, lechuga = false;
    String stringSandwich ="";
    TextView tvSandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej04_check_boxes);

        // Buscamos el textView que va a modificarse y lo deamos asignado a una variable.
        tvSandwich = findViewById(R.id.tvSandwich04);
    }



    public void onCheckboxClicked(View view) {
        // El evento salta al hacer click. Un click en el chechbox lo marca o lo desmarca.

        // Comprobamos si el Checkbox está o no marcado
        boolean checked = ((CheckBox) view).isChecked();

        // Comprobamos cual de los checkboxes ha sido marcado
        switch (view.getId()) {
            case R.id.cbJamon04:
                if (checked) jamon = true;
                else jamon = false;
                break;
            case R.id.cbQueso04:
                if (checked) queso = true;
                else queso = false;
                break;
            case R.id.cbLechuga04:
                if (checked) lechuga = true;
                else lechuga = false;
                break;
        }


        // Construimos el string

        // Si están los 3 ingredientes:
        if (jamon && queso && lechuga) stringSandwich = "Tu sandwich será de jamón, queso y lechuga.";
        // Si no, comprobamos uno por uno:
        else if (jamon) {
            stringSandwich = "Tu sandwich será de jamon";
            if (queso) stringSandwich+=" y queso.";
            else if (lechuga) stringSandwich+=" y lechuga.";
            else stringSandwich+=".";
        }
        else if (queso) {
            stringSandwich = "Tu sandwich será de queso";
            if (lechuga) stringSandwich+=" y lechuga.";
            else stringSandwich+=".";
        }
        else if (lechuga) {
            stringSandwich = "Tu sandwich será de lechuga.";
        }
        // Si no hay ninguno, el string queda vacío
        else stringSandwich="";

        // Despues de generar el string adecuado, lo asignamos al textView
        tvSandwich.setText(stringSandwich);
    }

}