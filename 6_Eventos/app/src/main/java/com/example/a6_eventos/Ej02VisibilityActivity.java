package com.example.a6_eventos;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Ej02VisibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej02_visibility);

        /* Para gestionar el comportamiento del botón "Atrás":
         https://developer.android.com/guide/navigation/navigation-custom-back#java
         */
        getOnBackPressedDispatcher().addCallback(this,
                new OnBackPressedCallback(true) {
                    @Override
                    public void handleOnBackPressed() {
                        // Indicamos que el botón atrás iniciará una nueva MainActivity
                        startActivity(new Intent(Ej02VisibilityActivity.this, MainActivity.class));
                        // Además, la activity actual se finaliza (de ese modo,
                        // si tras pasar a MainActivity pulsamos otra vez el botón "Atrás",
                        // no regresa a ésta.
                        Ej02VisibilityActivity.this.finish();
                    }
                }
        );

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