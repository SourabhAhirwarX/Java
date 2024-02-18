// also check G.java

// first type thread implementation
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("X_thread");
        t.start();

        System.out.println(Thread.currentThread().getName());   // since, it is in the main thread
    }
}

// the Thread we have created will take some time to start, so the main Thread will execute prior to our Thread...