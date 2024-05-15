package com.example;

import com.MioTrhead;

public class Main {
    public static void main(String[] args) {
        MioTrhead trhead= new MioTrhead();

        for(int i = 0; i< 10; i++){
            System.out.println("sono stanco della scuola " + i);
        }
        trhead.run();
    }
}