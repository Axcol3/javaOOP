package org.example.Threads;

class ChfOlivia implements Runnable {
    public void run(){
        System.out.println("Chef Olivia started and waiting for sausage to thaw ... ");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef Olivia is done cutting sausage.");
    }
}
public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Barron started and requesting Olivia help");
        Thread olivia = new Thread(new ChfOlivia());
        System.out.println("Olivia's state is " + olivia.getState());

        System.out.println("Barron tells Olivia to start");
        olivia.start();
        System.out.println("Olivia's state is " + olivia.getState());

        System.out.println("Barron continues cooking soup.");
        Thread.sleep(1000);
        System.out.println("Olivia's state is " + olivia.getState());

        System.out.println("Barron patiently waits for Olivia to finish and to join ...");
        olivia.join();
        System.out.println("Olivia's state is " + olivia.getState());

        System.out.println("Barron and Olivia are both done.");
    }
}
