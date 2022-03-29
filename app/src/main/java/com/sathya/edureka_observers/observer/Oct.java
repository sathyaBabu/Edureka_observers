package com.sathya.edureka_observers.observer;

import android.util.Log;

public class Oct extends Observer{
    public Oct(Subject subject1) {
        //super();
        subject = subject1;
        subject.attach( this);

    }

    @Override
    public void update() {

        Log.d("tag"," Convertinig data to Oct "+Integer.toOctalString(subject.getState()));

    }
}
