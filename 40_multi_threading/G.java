class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("X_thread");
        // t.start();
        t.run();        // without starting the thread it will show the main thread

        System.out.println(Thread.currentThread().getName() + " ~~~> main");
    }
}

// also check E.java...

// t.run()    => in this case run() method stacks up in the main Thread because we didn't started the new Thread
// t.start()  => in this case run() methods stacks up at the bottom of the new Thread i.e. X_thread