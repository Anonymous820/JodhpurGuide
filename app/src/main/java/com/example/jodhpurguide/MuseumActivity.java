package com.example.jodhpurguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MuseumActivity extends AppCompatActivity {
ImageView i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);


        i1=findViewById(R.id.m1);
        i2=findViewById(R.id.m2);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(MuseumActivity.this,MehrangarhMuseumActivity.class);
                startActivity(next);
            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(MuseumActivity.this,UmaidMuseumActivity.class);
                startActivity(next);
            }
        });





    }
}
