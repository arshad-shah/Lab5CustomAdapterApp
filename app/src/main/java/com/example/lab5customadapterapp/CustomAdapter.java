package com.example.lab5customadapterapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<nameOfMonth> {

    ArrayList<nameOfMonth> months;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<nameOfMonth> objects) {
        super(context, resource, objects);
        months = objects;
    }

    @Override
    public View getView(int Position, View ConvertView, ViewGroup parent){

        View row = ConvertView;

        Context context = getContext();
        LayoutInflater inflater = LayoutInflater.from(context);


        row = inflater.inflate(R.layout.row,parent,false);

        nameOfMonth month = months.get(Position);
        final ImageView image = row.findViewById(R.id.image);
        final TextView nameOfTheMonth = row.findViewById(R.id.nameOfMonth);
        final TextView numberOfTheMonth = row.findViewById(R.id.numberOfTheMonth);

        LocalDate currentdate = LocalDate.now();
        Month currentMonth = currentdate.getMonth();

        String monthValue = String.valueOf(currentMonth);
        String currentMonthString = monthValue.toLowerCase();

        if(month.getNameOfTheMonth().equals(currentMonthString)){
            image.setImageResource(R.drawable.ok);
        }
        else{
            image.setImageResource(R.drawable.xmark);
        }

        nameOfTheMonth.setText(month.getNameOfTheMonth());
        numberOfTheMonth.setText(month.getNumberOfTheMonth());
        return row;

    }
}
