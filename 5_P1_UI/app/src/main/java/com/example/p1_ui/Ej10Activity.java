package com.example.p1_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ej10Activity extends AppCompatActivity {

    private static final String MENSAJE_EMPTY_USER = "Debe introducir un nombre de usuario";
    private static final String MENSAJE_EMPTY_PASSWORD = "Debe introducir una contraseña";
    private static final String MENSAJE_INVALID_PASSWORD = "Su contraseña debe tener más de 8 caracteres";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej10);
    }

    public void iniciarSesion(View view) {
        EditText etUsuario = findViewById(R.id.et_user);
        EditText etPassword = findViewById(R.id.et_password);

        if (TextUtils.isEmpty(etUsuario.getText())) {
            Toast.makeText(this, MENSAJE_EMPTY_USER, Toast.LENGTH_SHORT).show();
        } else if (etPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, MENSAJE_EMPTY_PASSWORD, Toast.LENGTH_SHORT).show();
        } else if (etPassword.getText().length() <= 8) {
            Toast.makeText(this, MENSAJE_INVALID_PASSWORD, Toast.LENGTH_SHORT).show();
        } else {
            // Login válido
        }
    }
}