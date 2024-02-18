class MyThread extends Thread {
    public void run() {
        String threadName = Thread.currentThread().getName();       // golu_bhai

        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + threadName);
        }
    }
}


class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("golu_bhai");
        t.start();

        String threadName = Thread.currentThread().getName();       // main

        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + threadName);
        }

        System.out.println(" #### "+Thread.currentThread().getName()+" #### ");
    }
}