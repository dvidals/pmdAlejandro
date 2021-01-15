package com.example.a6_eventosintentsrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toEj1OnclickActivity(View view) {
        startActivity(new Intent(this, Ej1OnclickActivity.class));
    }

    public void toEj02VisibilityActivity(View view) {
        startActivity(new Intent(this, Ej02VisibilityActivity.class));
    }

    public void toEj03RotationActivity(View view) {
        startActivity(new Intent(this, Ej03RotationActivity.class));
    }
}