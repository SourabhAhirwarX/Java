/*
    Daemon Thread :- Supporting Thread Helped to process main Thread, 
                    its not general/compulsory that these thread will execute fully.
                    (generally they are of low priority)
        //  Exception: IllegalThreadStateException
        //  methods():
                    boolean -> isDaemon()
                    boolean -> setDaemon(true/false)
*/

class A {
    public static void main(String[] args) {
        Thread a = Thread.currentThread();
        System.out.println(a.isDaemon());

        Thread b = new Thread();
        System.out.println(b.isDaemon());
    }
}