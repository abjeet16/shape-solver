package com.example.shapesolver;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cylinder extends AppCompatActivity {

    Button calculate;
    EditText radiusText,heightText,csaText,tsaText,volumeText;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        calculate = findViewById(R.id.calculateButton);
        radiusText= findViewById(R.id.radius);
        csaText= findViewById(R.id.csa);
        tsaText=findViewById(R.id.tsa);
        heightText=findViewById(R.id.height);
        volumeText=findViewById(R.id.volume);

        calculate.setOnClickListener(v -> {
            String radius=radiusText.getText().toString();
            String height=heightText.getText().toString();

            float r = Float.parseFloat(radius);
            float h = Float.parseFloat(height);
            float pi = 3.14F;

            float csa = 2*pi*r*h;
            float tsa = 2*pi*r*(r+h);
            float volume = pi*r*r*h;

            csaText.setText(csa+" m^2");
            tsaText.setText(tsa+" m^2");
            volumeText.setText(volume+" m^3");
        });

    }
}