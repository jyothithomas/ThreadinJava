package com.lambton;


public class MultiThreadingMain{
    public static void main(String[] args) {
        DataTHread d1 = new DataTHread();
        DataTHreadRunnable d2 = new DataTHreadRunnable();
        try{
            d1.start();
            d1.join();
            Thread thread =new Thread(d2);
            thread.start();
            thread.join();

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println("*****END******");

    }

}
