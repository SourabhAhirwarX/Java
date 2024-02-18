/*
    In this case,
    if we marked any Thread(A) as Daemon Thread,
    Then, all The child Threads that are called from a Parent Thread(A) then,
    these Threads also marked as Daemon internally...
*/

class X extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - " + t.isDaemon());

        Y y = new Y();
        y.setName("B");
        // y.setDaemon(false);
        y.start();
    }
}

class Y extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - " + t.isDaemon());
    }
}

class A {
    public static void main(String[] args) throws InterruptedException{
        X x = new X();
        x.setName("A");
        x.setDaemon(true);
        x.start();

        Thread.sleep(1000);     
        /*
        we drag this thread to sleep for 1s, 
        because if we won't mark it as sleep then Daemon Threads (A) will not fully executes,
        so because of that Daemon Thread (B) will not execute , 
        Therefore we mark it as sleep to remains the main Thread in running stage... 
        */
    }
}