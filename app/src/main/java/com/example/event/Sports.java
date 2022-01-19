package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sports extends AppCompatActivity {

    Button Google;
    Button Google2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        Google=findViewById(R.id.Google);
        Google2=findViewById(R.id.Google2);

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { 
                gotoUrl("https://docs.google.com/forms/d/1fyM585m5VU3Sf2qmQfY73mWh_VRMLGShe1W_P5oFxSw/edit");
                
            }
        });

        Google2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/1fyM585m5VU3Sf2qmQfY73mWh_VRMLGShe1W_P5oFxSw/edit");

            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
