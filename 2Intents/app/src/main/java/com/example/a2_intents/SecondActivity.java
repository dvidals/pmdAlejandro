package com.example.a2_intents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    // método asociado con el botón a través de su atributo "onClick" definido en "activity_second.xml"
    public void toMainActivity(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}