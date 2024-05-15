package com;

public class MioTrhead extends Thread{

    @Override
    public synchronized void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i< 10; i++){
            System.out.println("la scuola è fantastaca " + i);
        }
    }

 


}
