package com.lambton;

public class DataTHreadRunnable implements Runnable {
    private static final String TAG = DataTHreadRunnable.class.getCanonicalName();

    @Override
    public void run() {
        //super.run();
        for (int i=0;i<10;i++){
            System.out.println(TAG+"  "+i);
        }

    }
}
