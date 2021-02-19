package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Ej03Activity extends AppCompatActivity {

    /* Las conversiones entre divisan cambian cada día, así que no se podría definir una fija.
    Una aplicación real debería conectarse a Internet y solicitar la conversión a alguna API.
     */
    private static final float EUR_POR_DOLLAR = 0.83f;


    TextView tvConversion;
    RadioGroup rgConversion;
    EditText etValor03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej03);


        tvConversion = findViewById(R.id.tvConversion);
        etValor03 = findViewById(R.id.etValor03);
        rgConversion = findViewById(R.id.rgConversion);

    }


    public void click03(View view) {

        try {
            float valor = Float.valueOf(etValor03.getText().toString());

            float valorConvertido;

            if (rgConversion.getCheckedRadioButtonId() == R.id.rbDolEur) {
                valorConvertido = valor * EUR_POR_DOLLAR;
                tvConversion.setText(valor + "$ equivalen a " + valorConvertido + "€");
            } else if (rgConversion.getCheckedRadioButtonId() == R.id.rbEurDol) {
                valorConvertido = valor / EUR_POR_DOLLAR;
                tvConversion.setText(valor + "€ equivalen a " + valorConvertido + "$");
            } else {
                tvConversion.setText("Debe seleccionar una conversión");
            }

        } catch (NumberFormatException e) {
            tvConversion.setText("Debe introducir un valor");
            return;
        }


    }
}