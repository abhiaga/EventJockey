package com.example.abhacharya.eventjockey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;

public class FirstEventActivity extends AppCompatActivity {
    private static final String LOG_TAG = "PlaceSelectionListener";
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

        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);
        /*autocompleteFragment.setBoundsBias(new LatLngBounds(
                new LatLng( 12.97232, 77.59480 ),
                new LatLng(12.89201, 77.58905)));*/


        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                // TODO: Get info about the selected place.
                System.out.println(place.getName());
                //Log.i(TAG, "Place: " + place.getName());
            }

            @Override
            public void onError(Status status) {
                // TODO: Handle the error.
                System.out.println("hi1");
                 Log.e(LOG_TAG, "onError: Status = " + status.toString());

            }
        });


    }


}
