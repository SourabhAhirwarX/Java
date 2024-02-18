class MyRunnable implements Runnable {
    public void run() {
        for(int i=0; i<10; i++) {
            synchronized(this) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try { Thread.sleep(50); }catch(InterruptedException e) { e.printStackTrace(); }
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