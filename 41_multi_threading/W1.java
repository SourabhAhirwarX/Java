/*
    Thread has been already started,
    so it generates Exception: 
        Exception in thread "main" java.lang.IllegalThreadStateException
            at java.base/java.lang.Thread.setDaemon(Thread.java:1410)
            at A.main(W1.java:8)
*/

class A {
    public static void main(String[] args) {
        Thread.currentThread().setDaemon(true);
    }
}