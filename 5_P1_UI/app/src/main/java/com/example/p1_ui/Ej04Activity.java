package com.example.p1_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ej04Activity extends AppCompatActivity {

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
        switch (view.getId()) {
            case R.id.ej04_btn_si:
                Toast.makeText(this, R.string.si, Toast.LENGTH_SHORT).show();
                break;
            case R.id.ej04_btn_no:
                Toast.makeText(this, R.string.no, Toast.LENGTH_SHORT).show();
                break;
            case R.id.ej04_btn_aveces:
                Toast.makeText(this, R.string.a_veces, Toast.LENGTH_SHORT).show();
                break;
        }


/*        String mensaje = "Se ha pulsado el botón \"" + ((Button) view).getText().toString() + "\"";
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();*/
    }
}