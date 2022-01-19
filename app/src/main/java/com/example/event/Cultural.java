package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cultural extends AppCompatActivity {

    Button Google3;
    Button Google4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);

        Google3=findViewById(R.id.Google3);
        Google4=findViewById(R.id.Google4);

        Google3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1yL_579lcvl0pQJsgHGuFYA0jGfIieIMZPP4Z6V4np88/edit");

            }
        });

        Google4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1OEVy3aGPEzx1xWOZ3w2QM5B0Jku4wMhVEGnDSJAhsX8/edit");

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
