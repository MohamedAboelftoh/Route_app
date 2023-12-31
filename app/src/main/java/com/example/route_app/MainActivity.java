package com.example.route_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAndriod = findViewById(R.id.btn_Android);
        Button btnIos = findViewById(R.id.btn_Ios);
        Button btnFullStack = findViewById(R.id.btn_FullStack);

        btnAndriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CoursesActivity.class);
                intent.putExtra("img",R.drawable.android);
                intent.putExtra("text",R.string.AndroidContent);
                startActivity(intent);
            }
        });

        btnIos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CoursesActivity.class);
                intent.putExtra("img",R.drawable.ios);
                intent.putExtra("text",R.string.IosContent);
                startActivity(intent);
            }
        });

        btnFullStack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CoursesActivity.class);
                intent.putExtra("img",R.drawable.fullstack);
                intent.putExtra("text",R.string.FullStackContent);
                startActivity(intent);

            }
        });
    }
}