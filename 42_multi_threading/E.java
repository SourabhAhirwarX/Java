/*
    here, we create the ThreadGroup named as "Quad" which is the member of the ThredGroup "main".
        and then make the members of Quad ThreadGroup that is t1("ISRAEL"), t2("UAE") and setMaxPriority as 3.
        and then create Threads of ThreadGroup Quad t3("US"), t4("BHARAT") and 
            setPriority as 
                        2, 
                        7(out of range that we set so, compiler gracefully ignore it),
                        12(which will generates Exception i.e. IllegalArgumentException)
        then we, print the priority of t3 and t4 Thread which will return 3, 3 (i.e. it doesn't changes)...
        
        conclution:- 
            we have to set the priority before creating the Thread otherwise, it will return the previous given value or normPriority(i.e. 5)
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

        t3.setPriority(2);
        t3.setPriority(7);  // compiler gracefully denies it...
        // t3.setPriority(45); // Exception in thread "main" java.lang.IllegalArgumentException

        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
    }
}