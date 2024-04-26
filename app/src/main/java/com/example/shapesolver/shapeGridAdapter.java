package com.example.shapesolver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class shapeGridAdapter extends ArrayAdapter<shape> {
    Context context;
    public shapeGridAdapter(ArrayList<shape> shapesArrayList, Context context) {
        super(context,R.layout.griditem, shapesArrayList);
        this.context = context;
    }

    private static class ViewHolder{
        ImageView shape;
        TextView nameofshape;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        shape shape = getItem(position);
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater =LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.griditem,
                    parent,
                    false
            );

            viewHolder.shape  = convertView.findViewById(R.id.imageView);
            viewHolder.nameofshape = convertView.findViewById(R.id.nameofshape);

            convertView.setTag(viewHolder);

        }else{
                viewHolder = (ViewHolder) convertView.getTag();
        }
        assert shape != null;
        viewHolder.shape.setImageResource(shape.getShapeImage());
        viewHolder.nameofshape.setText(shape.getShapeName());

        return  convertView;
    }
}
