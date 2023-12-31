package com.example.route_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CoursesActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        ImageView image = findViewById(R.id.imgAndriod);
        TextView textView = findViewById(R.id.textAndriod);
        image.setImageResource(getIntent().getIntExtra("img",-1));
        textView.setText(getIntent().getIntExtra("text",-1));
    }
}