package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


/**
 * https://developer.android.com/guide/components/intents-filters
 * https://developer.android.com/guide/components/intents-common
 * <p>
 * TODO: Cambios de la API 30:
 * https://stackoverflow.com/questions/62895098/android-api-30-getpackagemanager-resolveactivity-returns-null-with-action-view
 * https://developer.android.com/about/versions/11/privacy/package-visibility
 */
public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toResultRequestActivity(View v) {
        // Intent explícito: referenciamos directamente la clase de la activity
        startActivity(new Intent(this, ResultRequestActivity.class));
    }


    public void marcarTelefono(View v) {
        // Intent implícito: se indica la acción a realizar y no la actividad que la realizará
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:886120464"));

        if (intent.resolveActivity(getPackageManager()) != null) {
            Log.e("prueba", "if");
            startActivity(intent);
        } else {
            Log.e("prueba", "else");
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }

        /* try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }*/
    }


    public void enviarSMS(View v) {
        Uri uri = Uri.parse("smsto:886120464");
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", "Hola");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }


    public void irAWeb(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/avidaldo"));
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/avidaldo"));

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }


    public void openLocation(View view) {
        // Parse the location and create the intent.
        //Uri addressUri = Uri.parse("geo:42.2515086,-8.6920307"); // Localización por coordenadas concretas
        Uri addressUri = Uri.parse("geo:?q=Vigo");  // Búsqueda de "Vigo"
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:42.2515086,-8.6920307?z=18"));

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }


    public void crearAlarma(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Ir al trabajo")
                .putExtra(AlarmClock.EXTRA_HOUR, 11)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }


/*    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");  // https://en.wikipedia.org/wiki/Media_type
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{getResources().getString(R.string.email1)});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }*/


    public void email(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("mailto:avidaldo@edu.xunta.gal"));
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/avidaldo"));

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }


    /* Abrir la cámara. Se necesita añadir este permiso al manifest:
    <uses-feature android:name="android.hardware.camera" android:required="true" /> */
    public void foto(View view) {
        try {
            startActivity(new Intent("android.media.action.IMAGE_CAPTURE"));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, R.string.no_app_error, Toast.LENGTH_SHORT).show();
        }
    }


}