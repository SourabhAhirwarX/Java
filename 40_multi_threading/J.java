class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    public static void main(String[] args) {
        MyThread x = new MyThread();
        x.start();
        x.start();      // Exception in thread "main" java.lang.IllegalThreadStateException
    }
}