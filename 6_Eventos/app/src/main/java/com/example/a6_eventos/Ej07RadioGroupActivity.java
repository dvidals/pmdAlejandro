package com.example.a6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Ej07RadioGroupActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton sound, vibration, silent;
    private Button button;
    private TextView tv07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ej07_radio_group);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        sound = (RadioButton) findViewById(R.id.sound);
        vibration = (RadioButton) findViewById(R.id.vibration);
        silent = (RadioButton) findViewById(R.id.silent);
        tv07 = (TextView) findViewById(R.id.tv07);
        button = (Button) findViewById(R.id.chooseBtn);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.silent) {
                    Toast.makeText(getApplicationContext(), "Silencio", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.sound) {
                    Toast.makeText(getApplicationContext(), "Sonido", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Vibración", Toast.LENGTH_SHORT).show();
                }
            }

        });


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == sound.getId()) {
                    tv07.setText("Has elegido 'Sonido'.");
                } else if (selectedId == vibration.getId()) {
                    tv07.setText("Has elegido 'Vibración'.");
                } else {
                    tv07.setText("Has elegido 'Silencio'.");
                }
            }
        });
    }
}