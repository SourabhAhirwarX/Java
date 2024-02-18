class MyThread extends Thread {
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
        MyThread t1 = new MyThread();
        t1.setName("A");

        MyThread t2 = new MyThread();
        t2.setName("B");

        t1.start();
        t2.start();
    }
}