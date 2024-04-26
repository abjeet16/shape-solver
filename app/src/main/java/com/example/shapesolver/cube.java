package com.example.shapesolver;
//this is for CUBOID, sorry for the name mistake

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cube extends AppCompatActivity {
    EditText length,breath,height;
    EditText tsa,csa,volume;
    Button calculate;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        length= findViewById(R.id.length);
        breath = findViewById(R.id.breath);
        height = findViewById(R.id.height);

        tsa = findViewById(R.id.tsa);
        csa = findViewById(R.id.csa);
        volume= findViewById(R.id.volume);

        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(v -> {
            String h = height.getText().toString();
            float heightinINT = Float.parseFloat(h);

            String b = breath.getText().toString();
            float breathinINT= Float.parseFloat(b);

            String l = length.getText().toString();
            float lenthinINT = Float.parseFloat(l);

            float totalSA =2*(lenthinINT*breathinINT+breathinINT*heightinINT+lenthinINT*heightinINT);
            float volumE = heightinINT*breathinINT*lenthinINT;
            float curvedSA = 2*heightinINT*(lenthinINT+breathinINT);

            tsa.setText(totalSA+" m^2");
            csa.setText(curvedSA+" m^2");
            volume.setText(volumE+" m^3");

        });

    }
}