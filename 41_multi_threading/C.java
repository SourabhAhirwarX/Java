class X implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i<5; i++) {
            System.out.println(i+" - "+t.getName()+" is going to withdraw...");
            A.ac.withdraw(10, i);
        }
    }
}

class A {
    static Account ac = new Account();
    public static void main(String[] args) {
        X x = new X();

        Thread a = new Thread(x, "motu");
        Thread b = new Thread(x, "patlu");

        a.start();
        b.start();
    }
}

class Account {
    private int balance = 50;
    String acType = "saving";
    String acNum = "A23t435";

    synchronized public int getBalance() {
        return balance;
    }

    synchronized public void withdraw(int amt, int i) {
        if(balance>=amt) {
            // try { Thread.sleep(1000); }catch(InterruptedException e) { e.printStackTrace(); }
            balance -= amt;
            System.out.println(i+" - "+Thread.currentThread().getName()+" is going to withrawal... "+A.ac.getBalance());
        } 
        // else {   // just for trial
        //     System.out.println("Not enough balance to debit "+ i +" - "+Thread.currentThread().getName());
        // }
    }
}