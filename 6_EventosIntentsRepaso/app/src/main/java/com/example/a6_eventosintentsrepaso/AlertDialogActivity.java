package com.example.a6_eventosintentsrepaso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class AlertDialogActivity extends AppCompatActivity {

    TextView tv;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        tv = (TextView) findViewById(R.id.textView2);

        tb= findViewById(R.id.toggleButton);



    }

    public void toggle(View view) {

        if (tb.isChecked()) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Atención!");
            alertDialogBuilder.setMessage("Vas a ocultar el texto");
            alertDialogBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    tv.setVisibility(View.GONE);
                }
            });
            alertDialogBuilder.show();


        }
        else tv.setVisibility(View.VISIBLE);
    }

}