// All concept of priority distribution on parent child relation threads....

class MyRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - " + t.getPriority());
        t.setPriority(3);
        System.out.println(t.getName() + " - " + t.getPriority());
        X x = new X();
        x.setName("B");
        x.start();
    }
}

class X extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - " + t.getPriority());
    }
}

class A {
    public static void main(String[] args) {
        Thread s = new Thread(new MyRunnable(), "golu");
        s.start();
        System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());
    }
}