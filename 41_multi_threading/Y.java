/*
    we are getting the list of Threads a particular ThreadGroup contains, using list() method
*/

class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        // t.getThreadGroup().list();
        t.getThreadGroup().getParent().list();
    }
}