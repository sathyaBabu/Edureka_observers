package com.sathya.edureka_observers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sathya.edureka_observers.observer.Bin;
import com.sathya.edureka_observers.observer.Hex;
import com.sathya.edureka_observers.observer.Oct;
import com.sathya.edureka_observers.observer.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This comes handy while testing since we use aggregation

        // 2. ProgressBarModel
        Subject subject = new Subject();

        // Composition / Aggregation here for testing purpose..
        // Mocking the obj

        // When where did you book

        new Hex( subject);   // driver --> profit free
        new Bin( subject);   // customer --> Pay   ( you Om prakash is booking the cab )
        new Oct( subject);   // uber  --> Car is free

        // 3. model is been given to the controller
        // 1. Progress Bar controller is a concrete class Hex Bin Oct

        // Destination..  .// Case 2 allocating a free driver
        subject.setState( 12 );  // we need to notify all concreat class Hex Bin Oct


    }
}