package com.sathya.edureka_observers.observer;

public class Subject {

    // Subject stores the concreat obj Hex Dec Oct Bin

    private  Observer[] Observers = new Observer[9];
    private int totalObj = 0 ;
    private int state ;

    public  void attach( Observer observer){
        Observers[ totalObj++] = observer;   // customers

    }

    public  int getState(){
        return state ;

    }

    public void setState( int in){

        state = in ;
        notifyMe();

    }
    public void notifyMe() {

        for( int i = 0 ; i< totalObj ; i++){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Observers[i].update( );  // HEx dec bin Oct   // free drivers..
        }


    }

}
