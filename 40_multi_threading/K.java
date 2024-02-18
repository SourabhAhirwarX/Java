class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);       // passing target object to the Thread class Object
        t.setName("bablu");
        t.start();

        System.out.println(Thread.currentThread().getName());
    }
}