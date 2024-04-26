package com.example.shapesolver;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class hemishpere extends AppCompatActivity {

    Button calculate;
    EditText tsaText,csaText,volumeText,radiusText;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemishpere);

        calculate=findViewById(R.id.calculateButton);
        tsaText=findViewById(R.id.tsaText);
        csaText=findViewById(R.id.csaText);
        volumeText=findViewById(R.id.volumeText);
        radiusText=findViewById(R.id.radiusText);

        calculate.setOnClickListener(v -> {
            String radiusValue = radiusText.getText().toString();
            float r = Float.parseFloat(radiusValue);
            float pi = 3.14F;

            float tsa = 3*pi*r*r;
            float csa = 2*pi*r*r;
            float volume = (2*pi*r*r*r)/3;

            tsaText.setText(tsa+" m^2");
            csaText.setText(csa+" m^2");
            volumeText.setText(volume+" m^3");
        });
    }
}