/*
    here, we are creating a ThreadGroup named as "Quad", which is the member of "main" ThreadGroup.
    then, creating object of class X, which we will pass as target in creating Thread. 
    then, inside Quad ThreadGroup We are making its Thread members:
                                            t1("ISRAEL"), t2("UAE")
                                                and get there priority which will return 5 & 5(i.e. the normPriority)
    then, set the MaxPriority as 3 and make Threads:
                                            t3("US"), t4("BHARAT")
                                                and there priority which will return 3 & 3(which we recently setted)

    Conclution:
        first set the Priority and then Make the new Thread otherwise it will give the normPriority(i.e. 5)...
*/

class X implements Runnable {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Quad");

        X x = new X();
        Thread t1 = new Thread(tg, x, "ISRAEL");
        Thread t2 = new Thread(tg, x, "UAE");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        tg.setMaxPriority(3);

        Thread t3 = new Thread(tg, x, "US");
        Thread t4 = new Thread(tg, x, "BHARAT");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
    }
}