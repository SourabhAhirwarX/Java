class X extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i<1000; i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        X x = new X();
        x.setName("A");
        x.start();

        try { x.join(20); }catch(InterruptedException e) { e.printStackTrace(); }
        
        Thread t = Thread.currentThread();
        for(int i=0; i<50; i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}