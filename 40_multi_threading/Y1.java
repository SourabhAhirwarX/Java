class X implements Runnable {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        Thread t = new Thread(new X(), "A");
        System.out.println(t.isAlive());
        t.start();

        try { Thread.sleep(200); }catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println(t.isAlive());
    }
}