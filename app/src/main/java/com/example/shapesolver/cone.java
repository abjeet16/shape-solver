package com.example.shapesolver;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cone extends AppCompatActivity {
    Button calculate;
    EditText length,height,radius,tsaTEXT,csaTEXT,volumeTEXT;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        calculate = findViewById(R.id.calculateButton);
        radius= findViewById(R.id.radiusText);
        csaTEXT= findViewById(R.id.csaText);
        tsaTEXT=findViewById(R.id.tsaText);
        height=findViewById(R.id.heightText);
        volumeTEXT=findViewById(R.id.volumeText);
        length=findViewById(R.id.lengthText);

        calculate.setOnClickListener(v -> {
            String ra = radius.getText().toString();
            String le = length.getText().toString();
            String he = height.getText().toString();

            float r = Float.parseFloat(ra);
            float l = Float.parseFloat(le);
            float h = Float.parseFloat(he);
            float pi = 3.14F;

            float csa = pi*r*l;
            float tsa = pi*r*(l+r);
            float volume = (pi*r*r*h)/3;

            csaTEXT.setText(csa+" m^2");
            tsaTEXT.setText(tsa+" m^2");
            volumeTEXT.setText(volume+" m^3");
        });
    }
}