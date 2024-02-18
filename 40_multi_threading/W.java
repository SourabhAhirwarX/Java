class X extends Thread {
    public void run() {
        try{ A.y.join(); }catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName());
    }
}

class Y extends Thread {
    public void run() {
        try{ A.x.join(); }catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    static X x;
    static Y y;

    public static void main(String[] args) throws InterruptedException {
        x = new X();
        x.setName("A");
        y = new Y();
        y.setName("B");

        x.start();
        y.start();
    }
}