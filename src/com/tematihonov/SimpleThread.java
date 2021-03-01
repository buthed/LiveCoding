package com.tematihonov;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        int i = 0;
            do {
                System.out.println("Привет, я новый поток!");
                //          Thread.sleep(1000);
                ++i;
            } while (i < 3 && !isInterrupted());

    }
}
