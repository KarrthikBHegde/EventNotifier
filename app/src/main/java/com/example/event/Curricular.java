package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Curricular extends AppCompatActivity {

    Button Google5;
    Button Google6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curricular);

        Google5=findViewById(R.id.Google5);
        Google6=findViewById(R.id.Google6);

        Google5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1DVlOjhUFSu0pYieMNGx384V_Jdpm0SHBWfdnJvIa7JE/edit");

            }
        });

        Google6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1gDV0kgmVMiKGWKSjkfkkELZs7Akss0ILcCZUcN4BigA/edit");

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
