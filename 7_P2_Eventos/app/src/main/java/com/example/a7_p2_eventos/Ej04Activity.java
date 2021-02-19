package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.a7_p2_eventos.Ej04SecondActivity.DESPEDIDA;

public class Ej04Activity extends AppCompatActivity {

    static final String NOMBRE = "nombre";
    static final String TRATAMIENTO = "tratamiento";

    RadioGroup rgSrSra;
    EditText etNombre04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej04);

        etNombre04 = findViewById(R.id.etNombre04);
        rgSrSra = findViewById(R.id.rgSrSra);

        String mensajeRecibido = getIntent().getStringExtra(DESPEDIDA);
        if (mensajeRecibido != null)
            Toast.makeText(this, mensajeRecibido, Toast.LENGTH_SHORT).show();


        findViewById(R.id.button04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena;
                int checkedSrSra = rgSrSra.getCheckedRadioButtonId();

                if (etNombre04.getText().length() == 0) {
                    Toast.makeText(Ej04Activity.this, "ERROR: Debe introducir un nombre.", Toast.LENGTH_SHORT).show();
                } else if (checkedSrSra == -1) {
                    Toast.makeText(Ej04Activity.this, "ERROR: Debe elegir un tratamiento.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Ej04Activity.this, Ej04SecondActivity.class);
                    intent.putExtra(NOMBRE, etNombre04.getText().toString());
                    intent.putExtra(TRATAMIENTO, ((RadioButton) findViewById(rgSrSra.getCheckedRadioButtonId())).getText().toString());
                    startActivity(intent);

                }
            }
        });

    }
}