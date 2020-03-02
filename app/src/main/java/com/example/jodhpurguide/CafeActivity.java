package com.example.jodhpurguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CafeActivity extends AppCompatActivity {
ImageView i1,i2,i3,i4,i5,i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);


        i1=findViewById(R.id.c1);
        i2=findViewById(R.id.c2);
        i3=findViewById(R.id.c3);
        i4=findViewById(R.id.c4);
        i5=findViewById(R.id.c5);
        i6=findViewById(R.id.c6);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(CafeActivity.this,BookCafeActivity.class);
                startActivity(next);
            }
        });


        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(CafeActivity.this,CafeDActivity.class);
                startActivity(next);
            }
        });


        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(CafeActivity.this,DownTownCafeActivity.class);
                startActivity(next);
            }
        });


        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(CafeActivity.this,FilosCafeActivity.class);
                startActivity(next);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(CafeActivity.this,StepwellCafeActivity.class);
                startActivity(next);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(CafeActivity.this,SheeshaMahalActivity.class);
                startActivity(next);
            }
        });


    }
}
