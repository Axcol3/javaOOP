package org.example.DataRace;



class Shopp extends Thread{
    static int garlicCount = 0;

    private static synchronized void addGarlic(){
        garlicCount++;
    }
    public void run(){
        for(int i = 0; i < 10_000_000 ; i++)
            addGarlic();
    }
}
public class SynchronizedMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopp();
        Thread olivia = new Shopp();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy : " + Shopp.garlicCount + " garlics");
    }
}
