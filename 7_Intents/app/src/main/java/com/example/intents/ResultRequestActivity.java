package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.example.intents.ResultReturnActivity.CLAVE_MENSAJE;

public class ResultRequestActivity extends AppCompatActivity {

    /* Código que identificará qué resultado se recibe (por si esta Activity puede recibir más
    de un resultado */
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void toActionActivity(View view) {
        Intent intent = new Intent(this, ResultReturnActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    // Método de callback para recibir resultados
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        /* Comprobamos resultCode(si hay una respuesta correcta) y
        requestCode (qué resultado de los solicitados se está recuperando)
         */
        if ( (resultCode == RESULT_OK) && (requestCode==REQUEST_CODE)){
            Toast.makeText(this,
                    "Operación correcta: \n" + data.getStringExtra(CLAVE_MENSAJE),
                    Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Operación incorrecta", Toast.LENGTH_SHORT).show();
        }
    }


}