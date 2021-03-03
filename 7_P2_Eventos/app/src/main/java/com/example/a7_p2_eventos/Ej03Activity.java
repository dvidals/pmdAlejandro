package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ej03Activity extends AppCompatActivity {


    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    /* Las conversiones entre divisan cambian cada día, así que no se podría definir una fija.
    Una aplicación real debería conectarse a Internet y solicitar la conversión a alguna API.
     */
    private static final double EUR_POR_DOLLAR = 0.83;


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
            double valor = Double.parseDouble(etValor03.getText().toString());

            if (BigDecimal.valueOf(valor).scale() > 2) {
                tvConversion.setText("Una cifra en esa divisa no debe tener más de dos decimales.");
                return;
            }

            double valorConvertido;

            if (rgConversion.getCheckedRadioButtonId() == R.id.rbDolEur) {
                valorConvertido = valor * EUR_POR_DOLLAR;
                tvConversion.setText(valor + " $ equivalen a " + decimalFormat.format(valorConvertido) + " €");
            } else if (rgConversion.getCheckedRadioButtonId() == R.id.rbEurDol) {
                valorConvertido = valor / EUR_POR_DOLLAR;
                tvConversion.setText(valor + " .55€ equivalen a " + decimalFormat.format(valorConvertido) + " $");
            } else {
                tvConversion.setText("Debe seleccionar una conversión");
            }

        } catch (NumberFormatException e) {
            tvConversion.setText("Debe introducir un valor numérico");
            return;
        }


    }
}