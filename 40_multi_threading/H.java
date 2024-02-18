class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
    // Single parameterised run() method, so this method doesn't executed
    public void run(int t) {
        System.out.println(Thread.currentThread().getName() + "---------------");
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("X_thread");
        t.start();

        // t.run(45);

        System.out.println(124);    // for knowing the diff. b/w diff. S.o.p which will print main thread and which will print X_thread 
        
        System.out.println(Thread.currentThread().getName());
    }
}