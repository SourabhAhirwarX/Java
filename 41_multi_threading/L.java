class MyRunnable implements Runnable {
    public void run() {
        synchronized(this) {
            for(int i=0; i<10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread t1 = new Thread(r, "A");
        Thread t2 = new Thread(r, "B");

        t1.start();
        t2.start();
    }
}