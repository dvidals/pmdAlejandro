package com.example.p1_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Ej04Activity extends AppCompatActivity {

    private static final String MESSAGE_SI = "Se ha pulsado el botón \"Sí\"";
    private static final String MESSAGE_NO = "Se ha pulsado el botón \"No\"";
    private static final String MESSAGE_AVECES = "Se ha pulsado el botón \"A veces\"";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej04);
    }

    /**
     * Metodo común asociado al evento onClick en los 3 botones.
     *
     * @param view
     */
    public void onClickEj04(View view) {
/*        switch (view.getId()) {
            case R.id.ej04_btn_si:
                Toast.makeText(this, MESSAGE_SI, Toast.LENGTH_SHORT).show(); break;
            case R.id.ej04_btn_no:
                Toast.makeText(this, MESSAGE_NO, Toast.LENGTH_SHORT).show(); break;
            case R.id.ej04_btn_aveces:
                Toast.makeText(this, MESSAGE_AVECES, Toast.LENGTH_SHORT).show(); break;
        }*/


        String mensaje = "Se ha pulsado el botón \"" + ((Button) view).getText().toString() + "\"";
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}