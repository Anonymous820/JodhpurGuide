package com.example.jodhpurguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
Button b1,b2,b3,b4;
int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(LoginActivity.this,PlacesActivity.class);
                startActivity(next);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(LoginActivity.this,FoodActivity.class);
                startActivity(next);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(LoginActivity.this,CafeActivity.class);
                startActivity(next);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(LoginActivity.this,MuseumActivity.class);
                startActivity(next);


            }
        });

    }

    public void onBackPressed()
    {
        if (flag==0)
        {
            Toast.makeText(this, "Press again to exit", Toast.LENGTH_LONG).show();
            flag=1;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run()
                {
                    flag=0;
                }
            },2000);
        }
        else
            {
                super.onBackPressed();
        }

    }
}
