class AThread extends Thread {
    public void run() {
        X u = new X();
        u.process();
    }
}

class BThread extends Thread {
    public void run() {
        synchronized(X.class) {
            for(int i=0; i<10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.setName("A");
        BThread t2 = new BThread();
        t2.setName("B");

        t1.start();
        t2.start();
    }
}

class X {
    synchronized static void process() {
        for(int i=0; i<10; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}