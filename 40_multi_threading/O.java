class MyRunnable implements Runnable {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        // MyRunnable r = new MyRunnanle();
        // Thread t = new Thread(r);
        // t.setName("monu_bhai");

        Thread t1 = new Thread(new MyRunnable(), "monu_bhai"); // monu_bhai
        Thread t2 = Thread.currentThread();                         // main

        System.out.println(t2.getName() +" - "+ t2.getPriority());
        System.out.println(t1.getName() +" - "+ t1.getPriority());
    }
}