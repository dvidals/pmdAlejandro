package com.example.intents_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle datosDelIntent = getIntent().getExtras();
        if (datosDelIntent != null) {
            int numero = datosDelIntent.getInt("numero");
            String mensaje = datosDelIntent.getString(MainActivity.EXTRA_MESSAGE);
            Toast.makeText(this, "Datos recibidos:\nMensaje:" + mensaje + "\nNúnmero:" + numero,
                    Toast.LENGTH_LONG).show();

            TextView tv = findViewById(R.id.textView);
            tv.setText("Datos recibidos:\nMensaje:" + mensaje + "\nNúnmero:" + numero);
        }
    }

    // Método asociado con el botón a través de su atributo "onClick" definido en "activity_second.xml"
    public void toMainActivity(View view) {
        // Inicializa una activity a partir de un intent que refiere a MainActivity
        startActivity(new Intent(this, MainActivity.class));
    }
}