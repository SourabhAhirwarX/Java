class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i<100; i++) {
            System.out.println(i+" - "+t.getName()+" - "+t.getPriority());
        }
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("A");
        t.setPriority(10);
        t.start();

        Thread x = Thread.currentThread();
        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + x.getName() + " - " + x.getPriority());
        }
    }
}

// Since, it all depends upon native platform i.e. OS so, it will not showing any changes after assigning priority value to a particular Thread 