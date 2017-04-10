package com.example.abhacharya.eventjockey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class RealEvent2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button6);
        setSupportActionBar(toolbar);
        SeekBar price=(SeekBar) findViewById(R.id.seekBar) ;
        final TextView cost=(TextView) findViewById(R.id.textView11) ;
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RealEvent2.this, EventActivity.class);
                startActivity(intent);
                FirstIndex.ratingskip = true;

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RealEvent2.this, EventActivity.class);
                startActivity(intent);
                FirstIndex.ratingskip = false;

            }
        });
        price.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // TODO Auto-generated method stub

                cost.setText("Rs." + 1000 * progress);
                // Toast.makeText(getApplicationContext(), String.valueOf(progress),Toast.LENGTH_LONG).show();

            }
        });


    }

}
