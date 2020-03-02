package com.example.jodhpurguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Jdp extends AppCompatActivity {
Button btn;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent iNext=new Intent(Jdp.this,LoginActivity.class);
                startActivity(iNext);
                finish();
            }
        },2000);







    }
}
