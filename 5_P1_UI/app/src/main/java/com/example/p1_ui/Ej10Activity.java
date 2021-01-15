package com.example.p1_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ej10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej10);
    }

    public void iniciarSesion(View view) {
        EditText etUsuario = findViewById(R.id.et_user);
        EditText etPassword = findViewById(R.id.et_password);

        if (TextUtils.isEmpty(etUsuario.getText())) {
            Toast.makeText(this, R.string.empty_user, Toast.LENGTH_SHORT).show();
        } else if (etPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, R.string.empty_password, Toast.LENGTH_SHORT).show();
        } else if (etPassword.getText().length() <= 8) {
            Toast.makeText(this, R.string.invalid_password, Toast.LENGTH_SHORT).show();
        } else {
            // Comprobación de credenciales (Autenticación)
            // if (comprobacion) {
            //      sesion
            //      intent a activity
            // }
        }
    }


    public void forgotPassword(View view) {
        Toast.makeText(this, R.string.forgot_password, Toast.LENGTH_SHORT).show();
    }
}