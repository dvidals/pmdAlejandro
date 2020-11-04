
/**
 * https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es
 */


package com.example.a1_ciclodevida;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView tv;

    StringBuilder sb;

    private void addLinea(String linea) {
        sb.append(linea +"\n");
        tv = findViewById(R.id.tv1);
        tv.setText(sb.toString());
        Log.i("Ciclo de vida: ", linea); // Log.i con "i" de info, podría ser w(arning), e(rror)...
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sb = new StringBuilder("");
        addLinea("onCreate");


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
            }
        });
    }


    @Override protected void onStart() { super.onStart(); addLinea("onStart"); }
    @Override protected void onRestart() { super.onRestart(); addLinea("onRestart"); }
    @Override protected void onResume() { super.onResume(); addLinea("onResume"); }
    @Override protected void onPause() { super.onPause(); addLinea("onPause"); }
    @Override protected void onStop() { super.onStop(); addLinea("onStop"); }
    @Override protected void onDestroy() { super.onDestroy(); addLinea("onDestroy"); }



}