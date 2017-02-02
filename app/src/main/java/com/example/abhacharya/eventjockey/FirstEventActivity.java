package com.example.abhacharya.eventjockey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FirstEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Button button = (Button) findViewById(R.id.button2);
        setSupportActionBar(toolbar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FirstEventActivity.this, EventActivity.class);
                startActivity(intent);
            }
        });


    }


}
