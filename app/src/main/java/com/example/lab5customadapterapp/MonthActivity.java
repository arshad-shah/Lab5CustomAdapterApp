package com.example.lab5customadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MonthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);

        Intent intent = getIntent();
        String monthName = intent.getStringExtra("nameOfMonth");

        final TextView month = findViewById(R.id.monthName);

        month.setText(monthName);
    }
}