package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.a7_p2_eventos.Ej04SecondActivity.DESPEDIDA;

public class Ej042ResultActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;

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

        findViewById(R.id.button04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena;

                int checkedSrSra = rgSrSra.getCheckedRadioButtonId();

                if (etNombre04.getText().length() == 0) {
                    Toast.makeText(Ej042ResultActivity.this, "ERROR: Debe introducir un nombre.", Toast.LENGTH_SHORT).show();
                } else if (checkedSrSra == -1) {
                    Toast.makeText(Ej042ResultActivity.this, "ERROR: Debe elegir un tratamiento.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Ej042ResultActivity.this, Ej042ResultSecondActivity.class);
                    intent.putExtra(NOMBRE, etNombre04.getText().toString());
                    intent.putExtra(TRATAMIENTO, ((RadioButton) findViewById(rgSrSra.getCheckedRadioButtonId())).getText().toString());
                    startActivityForResult(intent, REQUEST_CODE);

                }
            }
        });

    }


    // Método de callback para recibir el resultado que vuelve de la otra activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Comprobamos si el requestCode es el solicitado
        if ((resultCode == RESULT_OK) && (requestCode == REQUEST_CODE)) {
            Toast.makeText(this, data.getStringExtra("MESSAGE"),
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Resultado incorrecto", Toast.LENGTH_SHORT).show();
        }
    }


}