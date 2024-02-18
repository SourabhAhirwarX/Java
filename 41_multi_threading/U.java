/*
    We are making a new(X) Thread as Daemon Thread here, 
    so it will not execute fully because, it is here for only supporting the main thread, 
    Hence, it will not perform all its iterations...
*/

class X extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        X x = new X();
        x.setName("A");
        x.setDaemon(true);
        x.start();

        for(int i=0; i<5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}