class X extends Thread {
    public void run() {
        Y y = new Y();
        y.setName("B");
        y.start();

        try { y.join(); }catch(InterruptedException e) { e.printStackTrace(); }
        for(int i=0; i<10; i++) { 
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}

class Y extends Thread {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        X x = new X();
        x.setName("A");
        x.start();

        try { x.join(); }catch(InterruptedException e) { e.printStackTrace(); }
        for(int i=0; i<10; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}