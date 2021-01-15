package com.example.a6_eventosintentsrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Ej02VisibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej02_visibility);
    }

    public void onToggleClicked(View view) {
        // Comprobamos si está a on o a off
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            ((ImageView) findViewById(R.id.iv_mira_aqui)).setVisibility(View.VISIBLE);
        } else {
            ((ImageView) findViewById(R.id.iv_mira_aqui)).setVisibility(View.INVISIBLE);
        }
    }
}