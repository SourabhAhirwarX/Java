/*
    Here, in this problem 
    we are making a Thread X of name "A" and started this Thread 
    when we call tg.activeCount() it will return the no. of Thread members the particular ThreadGroup contains i.e. 2
    when we call sleep method on main Thread, so at that time are Thread "A" completes its execution
    so, after that we call tg.activeCount() it will return 1 because thread A is no more alive(i.e. its completed its whole execution)...
*/

class X extends Thread {
    public void run() {    
        System.out.println("+++++");
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        X x = new X();
        x.setName("A");

        x.start();          

        tg.list();       
        System.out.println(tg.activeCount());

        Thread.sleep(100);

        tg.list();      
        System.out.println(tg.activeCount());
    }
}