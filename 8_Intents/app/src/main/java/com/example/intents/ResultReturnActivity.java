package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultReturnActivity extends AppCompatActivity {

    static final String CLAVE_MENSAJE = "mensaje";
    EditText etParaResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        etParaResult = findViewById(R.id.etParaResult);
    }

    public void retornar(View view) {
        Intent intent = new Intent();
        intent.putExtra(CLAVE_MENSAJE, etParaResult.getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish(); // Termina la actividad
    }
}