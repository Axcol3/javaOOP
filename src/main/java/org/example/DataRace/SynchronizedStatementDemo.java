package org.example.DataRace;


class Shop extends Thread{

    static Integer garlicCount = 0;

    public void run(){
        for(int i = 0; i < 10_000_000 ; i++)
            synchronized (garlicCount) {
                garlicCount++;
            }
    }
}
public class SynchronizedStatementDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shop();
        Thread olivia = new Shop();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy : " + Shop.garlicCount + " garlics");
    }
}
