/*
    here, we are creating a ThreadGroup named as "Quad" where,
        the Quad is the member of parent ThreadGroup system only.
        and then, creating its members i.e. 'US', 'Bharat', 'Japan', 'Australia' and start these Threads.
    then, we are printing activemembers of system, main & quad group i.e. 10, 1(only main), 4 respectively.
    then we are printing the list of group members i.e. elements the particular group contains...
*/

class X implements Runnable {
    public void run() {
        try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }
}

class A {
    public static void main(String[] args) {
        ThreadGroup ctg = Thread.currentThread().getThreadGroup();

        ThreadGroup tg = new ThreadGroup(ctg.getParent(), "Quad");

        X x = new X();

        Thread t1 = new Thread(tg, x, "US");
        Thread t2 = new Thread(tg, x, "Bharat");
        Thread t3 = new Thread(tg, x, "Japan");
        Thread t4 = new Thread(tg, x, "Australia");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("system thread group---> "+ ctg.getParent().activeCount());
        System.out.println("Main thread group---> "+ ctg.activeCount());
        System.out.println("quad thread group---> "+ tg.activeCount());

        System.out.println("*****************************************");
        
        ctg.getParent().list();
        System.out.println("-----------------------------------------");
        ctg.list();
        System.out.println("-----------------------------------------");
        tg.list();
    }
}