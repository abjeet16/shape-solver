package com.example.shapesolver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    ArrayList<shape> listOfShape;
    shapeGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= findViewById(R.id.gridView);

        listOfShape = new ArrayList<>();

        shape cube = new shape(R.drawable.cube,"cube");
        shape cylinder= new shape(R.drawable.cylinder,"cylinder");
        shape sphere = new shape(R.drawable.sphere,"sphere");
        shape prism = new shape(R.drawable.prism,"prism");
        shape cone = new shape(R.drawable.cone,"cone");
        shape hemishere = new shape(R.drawable.hemishere,"hemishere");

        listOfShape.add(cube);
        listOfShape.add(cylinder);
        listOfShape.add(sphere);
        listOfShape.add(prism);
        listOfShape.add(cone);
        listOfShape.add(hemishere);

        adapter = new shapeGridAdapter(listOfShape, getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Intent i;
            if (position == 0) {
                i = new Intent(getApplicationContext(), cubeReal.class);
                startActivity(i);
            } else if (position==1) {
                i = new Intent(getApplicationContext(),cylinder.class);
                startActivity(i);
            } else if (position==2) {
               i= new Intent(getApplicationContext(),sphere.class);
               startActivity(i);
            } else if (position == 3) {
                i = new Intent(getApplicationContext(), cube.class);
                startActivity(i);
            } else if (position==4) {
                i = new Intent(getApplicationContext(),cone.class);
                startActivity(i);
            }else if (position==5){
                i = new Intent(getApplicationContext(), hemishpere.class);
                startActivity(i);
            }
        });

    }
}