import java.util.Scanner;

class Producer extends Thread {
    public void run() {
        while(true) {
            A.c.writeRadius();
        }
    }
}

class Consumer extends Thread {
    public void run() {
        while(true) {
            A.c.readRadius();
        }
    }
}

class A {
    static Circle c = new Circle();

    public static void main(String[] args) {
        Producer p = new Producer();
        p.setName("Producer");

        Consumer c = new Consumer();
        c.setName("Consumer");

        p.start();
        c.start();
    }
}

class Circle {
    private int radius;

    Scanner sc = new Scanner(System.in);

    public synchronized void writeRadius() {
        if(radius == 0) {
            System.out.println("Producer Please Enter Radius: ");
            radius = sc.nextInt();
            notify();
        } else {
            System.out.println("Producer going to wait...");
            try{ 
                wait(); 
            } catch(InterruptedException e) {
                 e.printStackTrace(); 
            }
        }
    } 

    public synchronized void readRadius() {
        if(radius != 0) {
            System.out.println("Consumer going to read the radius: "+ radius);
            radius = 0;
            notify();
        } else {
            System.out.println("Consumer going to wait...");
            try{ 
                wait(); 
            } catch(InterruptedException e) {
                e.printStackTrace(); 
            }
        }
    }
}