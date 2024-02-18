/*
    In this case,
    if we make the Thread(A) as Daemon Thread,  after starting the Thread(already started),  
    then it will genrates Exception: 
        Exception in thread "main" java.lang.IllegalThreadStateException
            at java.base/java.lang.Thread.setDaemon(Thread.java:1410)
            at A.main(W.java:17)
*/

class X extends Thread {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        X x = new X();
        x.setName("A");
        x.start();

        x.setDaemon(true);
    }
}