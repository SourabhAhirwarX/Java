class MyRunnable implements Runnable {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        Thread t2 = Thread.currentThread();     // main
        System.out.println(t2.getName() +" - "+ t2.getPriority());
        t2.setPriority(8);
        System.out.println(t2.getName() +" - "+ t2.getPriority());

        Thread t1 = new Thread(new MyRunnable(), "monu_bhai");
        System.out.println(t1.getName() +" - "+ t1.getPriority());
    }
}