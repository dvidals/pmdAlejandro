package com.example.p1_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ej09Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej09);
    }

    public void guardar(View view) {
        Toast.makeText(this, R.string.guardado, Toast.LENGTH_SHORT).show();
    }


    public void cancelar(View view) {

        // declaramos una variable que referenciará al objeto del editText del comentario
        EditText cajaComentario;

        // Dicho objeto ha sido creado desde el xml, así que está definido por un "id" de la clase
        // autogenerada R, el cual buscamos y asignamos
        cajaComentario = findViewById(R.id.et_comentario);

        // accedemos al texto de este EditText y lo "limpiamos"
        cajaComentario.getText().clear();
        //también se podría hacer con:
        //cajaComentario.setText("");

        // Lo anterior podría resumirse en esta línea:
         ( (EditText) findViewById(R.id.et_comentario) ).getText().clear();
    }
}