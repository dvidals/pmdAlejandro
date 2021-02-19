package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Ej02Activity extends AppCompatActivity {

    RadioGroup rgDespedida, rgSrSra;
    TextView tvSaludo02;
    EditText etNombre02;
    CheckBox cbDespedida;

    String cadena= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej02);

        rgDespedida = findViewById(R.id.rgDespedida02);
        etNombre02 = findViewById(R.id.etNombre02);
        tvSaludo02 = findViewById(R.id.tvSaludo02);
        rgSrSra = findViewById(R.id.rgSrSra);
        cbDespedida = findViewById(R.id.cbDespedida02);


        cbDespedida.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {  // Si se ha marcado, se muestra el RadioGroup
                    rgDespedida.setVisibility(View.VISIBLE);
                } else {  // Y si se se ha desmarcado, se quita
                    rgDespedida.setVisibility(View.GONE);
                }
            }
        });


    }

    public void hola02(View view) {

        int checkedSrSra = rgSrSra.getCheckedRadioButtonId();

        // Comprobamos los campos obligatorios
        if (etNombre02.getText().length() == 0) {
            Toast.makeText(this, getResources().getString(R.string.error_nombre), Toast.LENGTH_SHORT).show();
        } else if ( checkedSrSra == -1) {
            Toast.makeText(this, "ERROR: Debe elegir un tratamiento.", Toast.LENGTH_SHORT).show();
        } else {

            RadioButton rbSrSraSeleccionado = findViewById(checkedSrSra);
            String stringSrSra = rbSrSraSeleccionado.getText().toString();

            cadena = getResources().getString(R.string.hola) + stringSrSra + " " + etNombre02.getText() + ".\n";

            int checkedDespedida = rgDespedida.getCheckedRadioButtonId();
            if (cbDespedida.isChecked() && checkedDespedida !=-1) {
                cadena += ((RadioButton)findViewById(checkedDespedida)).getText().toString();
            }

            tvSaludo02.setText(cadena);
        }
    }



}