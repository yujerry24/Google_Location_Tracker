package com.example.jerry.google_location_tracker;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class aboutJerry extends AppCompatActivity {

    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    public Button but5;

    public void init() {

        but1=(Button)findViewById(R.id.btnFacebook);
        but2=(Button)findViewById(R.id.btnGG);
        but3=(Button)findViewById(R.id.LinkedIn);
        but4=(Button)findViewById(R.id.btnTwitter);
        but5=(Button)findViewById(R.id.button);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookLink=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(facebookLink);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleLink=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(googleLink);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkedIn=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedIn.com"));
                startActivity(linkedIn);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitterLink=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"));
                startActivity(twitterLink);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack=new Intent(aboutJerry.this,MainActivity.class);
                startActivity(goBack);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_jerry);
        init();
        EditText e1 = (EditText) findViewById(R.id.nameJerry);
        EditText e2 = (EditText) findViewById(R.id.aboutJerry);

        e1.setFocusable(false);
        e2.setFocusable(false);

        String hello = "This <br /> is a test";

        e2.setText(Html.fromHtml(hello));

    }
}
