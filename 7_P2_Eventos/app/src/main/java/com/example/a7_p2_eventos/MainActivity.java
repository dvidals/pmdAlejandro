package com.example.a7_p2_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toEj01(View view) {
        startActivity(new Intent(this, Ej01Activity.class));
    }

    public void toEj02(View view) {
        startActivity(new Intent(this, Ej02Activity.class));
    }

    public void toEj03(View view) {
        startActivity(new Intent(this, Ej03Activity.class));
    }

    public void toEj04(View view) {
        startActivity(new Intent(this, Ej04Activity.class));
    }

    public void toEj05(View view) {
        startActivity(new Intent(this, Ej042ResultActivity.class));
    }


/*
    public void toEj07(View view) {
        startActivity(new Intent(this, Ej07Activity.class));
    }
    public void toEj08(View view) {
        startActivity(new Intent(this, Ej08Activity.class));
    }
    public void toEj09(View view) {
        startActivity(new Intent(this, Ej09Activity.class));
    }
    public void toEj10(View view) {
        startActivity(new Intent(this, Ej10Activity.class));
    }
    public void toEj11(View view) {
        startActivity(new Intent(this, Ej11Activity.class));
    }*/


}