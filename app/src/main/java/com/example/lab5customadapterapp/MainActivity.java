package com.example.lab5customadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.monthNames);

        ArrayList<nameOfMonth> monthNames = new ArrayList<>();

        Resources res = getResources();
        String[] nameOfMonths = res.getStringArray(R.array.nameOfMonths);
        int index = 0;
        for (int i = 0; i < nameOfMonths.length; i++) {
            index = i;
            monthNames.add(
                    new nameOfMonth(nameOfTheMonth(index), numberOfTheMonth(index))
            );
        }
        CustomAdapter adapter = new CustomAdapter(this,R.layout.row, monthNames);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                nameOfMonth clickedItem = (nameOfMonth) adapterView.getItemAtPosition(i);
                Intent navigateToMonthActivity = new Intent(MainActivity.this, MonthActivity.class);
                navigateToMonthActivity.putExtra("nameOfMonth", clickedItem.getNameOfTheMonth());
                startActivity(navigateToMonthActivity);
            }
        });
    }

    private String nameOfTheMonth(int index){
        Resources res = getResources();
        String[] nameOfMonths = res.getStringArray(R.array.nameOfMonths);
        return nameOfMonths[index];
    }
    private String numberOfTheMonth(int index){
        Resources res = getResources();
        String[] nameOfMonths = res.getStringArray(R.array.numberOfTheMonth);
        return nameOfMonths[index];
    }
}