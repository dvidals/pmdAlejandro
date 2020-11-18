/**
 * https://developer.android.com/guide/topics/ui/declaring-layout
 *
 */
package com.example.ui_basica;

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

    // método asociado al evento onclick del botón con nombre "FrameLayout"
    public void toEj01FrameLayoutActivity(View view) {
        // Creamos un intent explícito que especifica el paso a la actividad "Ej1LinearLayout"
        Intent intent = new Intent(this, Ej01FrameLayoutActivity.class);
        //Pasamos a la nueva activity
        startActivity(intent);
    }


    public void toEj2LinearLayoutActivity(View view) {
        startActivity(new Intent(this, Ej02LinearLayoutActivity.class));
    }
    public void toEj3LinearLayout2Activity(View view) {
        startActivity(new Intent(this, Ej03LinearLayout2Activity.class));
    }
    public void toEj4LinearLayout3Activity(View view) {
        startActivity(new Intent(this, Ej04LinearLayout3Activity.class));
    }
    public void toEj05LinearLayout4Activity(View view) {
        startActivity(new Intent(this, Ej05LinearLayout4Activity.class));
    }
    public void toEj06TableLayoutActivity(View view) {
        startActivity(new Intent(this, Ej06TableLayoutActivity.class));
    }
    public void toEj07RelativeLayoutActivity(View view) {
        startActivity(new Intent(this, Ej07RelativeLayoutActivity.class));
    }
    public void toEj08RelativeLayout2Activity(View view) {
        startActivity(new Intent(this, Ej08RelativeLayout2Activity.class));
    }
    public void toEj09BasicosActivity(View view) {
        startActivity(new Intent(this, Ej09BasicosActivity.class));
    }
    public void toEj10PaddingMarginActivity(View view) {
        startActivity(new Intent(this, Ej10PaddingMarginActivity.class));
    }
    public void toEj11DefinicionRecursosActivity(View view) {
        startActivity(new Intent(this, Ej11DefinicionRecursosActivity.class));
    }
    public void toEj12ProgramaticoActivity(View view) {
        startActivity(new Intent(this, Ej12ProgramaticoActivity.class));
    }


}