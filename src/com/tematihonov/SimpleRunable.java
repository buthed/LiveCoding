package com.tematihonov;

public class SimpleRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("Я новый поток, созданный через интерфейс!");

    }
}
