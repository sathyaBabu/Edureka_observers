package com.sathya.edureka_observers.observer;

import android.util.Log;

public class Bin extends Observer{
    public Bin(Subject subject1) {
        //super();
        subject = subject1;
        subject.attach( this);

    }

    @Override
    public void update() {

        Log.d("tag"," Convertinig data to Bin "+Integer.toBinaryString(subject.getState()));

    }
}
