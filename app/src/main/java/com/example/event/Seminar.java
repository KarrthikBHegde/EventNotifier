package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seminar extends AppCompatActivity {

    Button Google7;
    Button Google8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seminar);

        Google7=findViewById(R.id.Google7);
        Google8=findViewById(R.id.Google8);

        Google7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1Ru4R1AMRzN5BzM1ZWsFJxvt6NZcUJxQPjSBz1qKA6d0/edit");

            }
        });

        Google8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1Pzbe-yLoQpprzAkOX-lSXcpTJ5jhW_S0DgMRTPHGNXg/edit");

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
