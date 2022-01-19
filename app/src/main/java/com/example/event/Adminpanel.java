package com.example.event;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Adminpanel extends AppCompatActivity {
   Button logout;
    private Button Spo;
    private Button Cult;
    private Button Curri;
    private Button Semi;

   @Override
    protected void onCreate(Bundle savedInstancestate){
       super.onCreate(savedInstancestate);
       setContentView(R.layout.adminpanel);
       Spo = findViewById(R.id.Spo);
       Cult = findViewById(R.id.Cult);
       Curri = findViewById(R.id.Curri);
       Semi = findViewById(R.id.Semi);
       logout.findViewById(R.id.logout);

       Spo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Adminpanel.this, AddSpo.class);
               startActivity(intent);
           }

       });

       Cult.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Adminpanel.this, AddCult.class);
               startActivity(intent);
           }

       });

       Curri.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Adminpanel.this, AddCuri.class);
               startActivity(intent);
           }

       });

       Semi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Adminpanel.this, AddSemi.class);
               startActivity(intent);
           }

       });

       logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(Adminpanel.this,admin.class);
               startActivity(intent);
               finish();
               Toast.makeText(Adminpanel.this,"Successfully Log out",Toast.LENGTH_SHORT).show();
           }
       });


   }
}




