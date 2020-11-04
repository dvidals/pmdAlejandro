package com.example.a2_guibasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ej2IntentsExplicitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej2_intents_explicitos);
    }

    public void toEj2Activity2(View view) {
        startActivity(new Intent(this, Ej2Activity2.class));
    }
}