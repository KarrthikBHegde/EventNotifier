package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button sports;
    private Button cultural;
    private Button curricular;
    private Button seminar;
    private TextView adminbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sports = findViewById(R.id.sports);
        cultural = findViewById(R.id.cultural);
        curricular = findViewById(R.id.curricular);
        seminar = findViewById(R.id.seminar);
        adminbutton = findViewById(R.id.adminbutton);

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sports.class);
                startActivity(intent);
            }

        });

        cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cultural.class);
                startActivity(intent);
            }

        });

        curricular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Curricular.class);
                startActivity(intent);
            }
        });

        seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Seminar.class);
                startActivity(intent);
            }
        });
        adminbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, admin.class);
                    startActivity(intent);
                }
            });
        }
    }



