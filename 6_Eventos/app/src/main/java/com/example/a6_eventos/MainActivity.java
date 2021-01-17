package com.example.a6_eventos;

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

    public void toEj1OnclickActivity(View view) {
        startActivity(new Intent(this, Ej01OnclickActivity.class));
    }

    public void toEj02VisibilityActivity(View view) {
        startActivity(new Intent(this, Ej02VisibilityActivity.class));
    }

    public void toEj03RotationActivity(View view) {
        startActivity(new Intent(this, Ej03RotationActivity.class));
    }

    public void toEj04CheckBoxesActivity(View view) {
        startActivity(new Intent(this, Ej04CheckBoxesActivity.class));
    }

    public void toEj05CheckBoxes2Activity(View view) {
        startActivity(new Intent(this, Ej05CheckBoxes2Activity.class));
    }

    public void toEj06CheckBoxes3Activity(View view) {
        startActivity(new Intent(this, Ej06CheckBoxes3Activity.class));
    }

    public void toEj07RadioGroupActivity(View view) {
        startActivity(new Intent(this, Ej07RadioGroupActivity.class));
    }
}