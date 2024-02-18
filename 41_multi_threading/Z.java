class X extends Thread {
    public void run() {
        System.out.println("+++++");
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        X x = new X();
        x.setName("A");

        x.start();          // it will take some time to come from Runnable-> Running stage

        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        tg.list();      // before sleep ThreadGroup contains two Thread member (i.e. main and A) 

        Thread.sleep(1000);

        tg.list();      // after some time main ThreadGroup contains Only one Thread member (i.e. main)
    }
}