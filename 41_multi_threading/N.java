class MyRunnable implements Runnable {
    public void run() {
        synchronized(A.x) {
            for(int i=0; i<10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
            }
        }
    }
}

class A {
    static X x = new X();

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");

        t1.start();
        t2.start();
    }
}

class X {  }