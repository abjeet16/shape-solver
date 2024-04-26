package com.example.shapesolver;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cubeReal extends AppCompatActivity {

    EditText sideValue,tsa,csa,volume;

    Button calculate;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_real);

        calculate= findViewById(R.id.calculateButton);
        sideValue=findViewById(R.id.measureOfSide);
        tsa = findViewById(R.id.tsaValue);
        csa = findViewById(R.id.csaValue);
        volume = findViewById(R.id.volumeValue);

        calculate.setOnClickListener(v -> {
            String sideString = sideValue.getText().toString();
            float side = Float.parseFloat(sideString);

            float tsaFloat = 6*side*side;
            float csaFloat = 4*side*side;
            float volumeFloat = side*side*side;

            tsa.setText(tsaFloat+" m^2");
            csa.setText(csaFloat+" m^2");
            volume.setText(volumeFloat+" m^3");

        });
    }
}