package com.example.jerry.google_location_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button but1;
    public Button but2;
    public void init() {

        but1=(Button)findViewById(R.id.about);
        but2=(Button)findViewById(R.id.enter);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change=new Intent(MainActivity.this,aboutJerry.class);
                startActivity(change);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change2=new Intent(MainActivity.this, MapsActivity.class);
                startActivity(change2);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
