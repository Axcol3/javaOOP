package org.example.Threads;

class KitchenCleaner extends Thread {
    public void run(){
        while(true){
            System.out.println("Chef Olivia started and waiting for sausage to thaw ... ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class DaemonThreadDemo  {
    public static void main(String[] args) throws InterruptedException {
        Thread olivia = new KitchenCleaner();
        olivia.setDaemon(true);
        olivia.start();

        System.out.println("Barron is cooking ...");
        Thread.sleep(600);
        System.out.println("Barron is cooking ...");
        Thread.sleep(600);
        System.out.println("Barron is cooking ...");
        Thread.sleep(600);
        System.out.println("Barron is done");

    }
}
