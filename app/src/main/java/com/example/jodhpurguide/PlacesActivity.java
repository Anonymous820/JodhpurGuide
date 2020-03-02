package com.example.jodhpurguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlacesActivity extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        i1=findViewById(R.id.l1);
        i2=findViewById(R.id.l2);
        i3=findViewById(R.id.l3);
        i4=findViewById(R.id.l4);
        i5=findViewById(R.id.l5);
        i6=findViewById(R.id.l6);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(PlacesActivity.this,mehrangarhActivity.class);
                startActivity(next);
            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(PlacesActivity.this,ghantagarhActivity.class);
                startActivity(next);
            }
        });


        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(PlacesActivity.this,jaswantthadaActivity.class);
                startActivity(next);
            }
        });


        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(PlacesActivity.this,kaylanalakeActivity.class);
                startActivity(next);
            }
        });


        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(PlacesActivity.this,machiaparkActivity.class);
                startActivity(next);
            }
        });


        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(PlacesActivity.this, umaidpActivity.class);
                startActivity(next);
            }
        });





    }
}
