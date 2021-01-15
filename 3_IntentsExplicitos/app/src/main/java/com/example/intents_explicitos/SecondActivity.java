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

        // Lectura de los datos incluidos en el intent desde el que se creó la actividad
        Bundle datosDelIntent = getIntent().getExtras();

        /* Comprobación de que el Intent contenga algún extra; es decir, que el Bundle que
        devuelve "getExtras()" no sea null. Ya que cuando cambiamos de actividad con el botón
        que no pasa extras, eso generaría una nullPointerExcepcion al intentar leer de ese Bundle */
        if (datosDelIntent != null) {


            int numero = datosDelIntent.getInt("numero"); // Leemos el int pasado

            // Leemos el String pasado
            //String mensaje = datosDelIntent.getString(MainActivity.EXTRA_MESSAGE);
            String mensaje = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);

            Toast.makeText(this, "Datos recibidos:\nMensaje:" + mensaje + "\nNúnmero:" + numero,
                    Toast.LENGTH_LONG).show();

            // Buscamos el textView (no se instancia porque ya está autogenerado desde el xml)
            TextView tv = findViewById(R.id.textView);
            // seteamos el contenido del textView con el mensaje recibido desde el Intent
            tv.setText("Datos recibidos:\nMensaje:" + mensaje + "\nNúnmero:" + numero);
        }
    }

    // Método asociado con el botón a través de su atributo "onClick" definido en "activity_second.xml"
    public void toMainActivity(View view) {
        // Inicializa una activity a partir de un intent que refiere a MainActivity
        startActivity(new Intent(this, MainActivity.class));
    }
}