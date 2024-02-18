class MThread extends Thread {
    public void run() {
        A.x.pro();
    }
}

class NThread extends Thread {
    public void run() {
        A.y.info();
    }
}

class A {
    static X x = new X();
    static Y y = new Y();

    public static void main(String[] args) {
        MThread a = new MThread();
        a.setName("A");

        NThread b = new NThread();
        b.setName("B");

        a.start();
        b.start();
    }
}

class X {
    synchronized void pro() {
        try{ Thread.sleep(100); }catch(InterruptedException e) { e.printStackTrace(); }
        A.y.info();
        System.out.println("X-pro()");
    }
}

class Y {
    synchronized void info() {
        try{ Thread.sleep(100); }catch(InterruptedException e) { e.printStackTrace(); }
        A.x.pro();
        System.out.println("Y-info()");
    }
}