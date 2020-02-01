package com.lambton;

public class DataTHread extends Thread {
    private static final String TAG = DataTHread.class.getCanonicalName();
    @Override
    public void run() {
        super.run();
        for (int i=0;i<10;i++){
            System.out.println(TAG+"  "+i);
        }

    }
}
