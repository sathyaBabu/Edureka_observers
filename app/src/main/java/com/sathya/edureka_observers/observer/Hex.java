package com.sathya.edureka_observers.observer;

import android.util.Log;

public class Hex  extends Observer{
    public Hex(Subject subject1) {
        //super();
        subject = subject1;
        subject.attach( this);  // we are attaching customer to the subject ( Uber ) Hex

    }

    @Override
    public void update() {

        Log.d("tag"," Convertinig data to Hex "+Integer.toHexString(subject.getState()));

    }
}
/*
Assignment using Observer template and builder

// observable
        Observable<String> animalsObservable = getAnimalsObservable();

        // observer
        Observer<String> animalsObserver = getAnimalsObserver();

        // observer subscribing to observable
        animalsObservable
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(animalsObserver);
    }

    private Observer<String> getAnimalsObserver() {
        return new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe");
            }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "Name: " + s);
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "All items are emitted!");
            }
        };
    }

    private Observable<String> getAnimalsObservable() {
        return Observable.just("Ant", "Bee", "Cat", "Dog", "Fox");
    }
}
 */