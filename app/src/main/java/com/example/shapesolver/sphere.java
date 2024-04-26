package com.example.shapesolver;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class sphere extends AppCompatActivity {

    Button calucteButton;

    EditText areaTExt,volumeText,radiusTExt;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        radiusTExt = findViewById(R.id.radiusText);
        volumeText= findViewById(R.id.volume);
        areaTExt= findViewById(R.id.area);
        calucteButton = findViewById(R.id.calculateButton);

        calucteButton.setOnClickListener(v -> {
            String radius = radiusTExt.getText().toString();
            float r = Float.parseFloat(radius);
            float pi = 3.14F;

            float area = 4*pi*r*r;
            float volume = (4*pi*r*r*r)/3;

            areaTExt.setText(area+" m^2");
            volumeText.setText(volume+" m^3");
        });
    }
}