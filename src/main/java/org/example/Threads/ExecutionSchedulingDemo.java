package org.example.Threads;

class VegetableChopper extends Thread{
    public int vegetable_count = 0;
    public static boolean chopping = true;

    public VegetableChopper(String name){
        this.setName(name);
    }

    public void run(){
        while(chopping){
            System.out.println(this.getName() + " chopped a vegetable");
            vegetable_count++;
        }
    }

}
public class ExecutionSchedulingDemo {
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper olivia = new VegetableChopper("Olivia");
        VegetableChopper baron = new VegetableChopper("Baron");

        olivia.start();
        baron.start();
        Thread.sleep(1000);
        VegetableChopper.chopping = false;


        baron.join();
        olivia.join();
        System.out.format("Baron chopped %d a vegetable . \n", baron.vegetable_count);
        System.out.format("Olivia chopped %d a vegetable . \n", olivia.vegetable_count);

    }
}
