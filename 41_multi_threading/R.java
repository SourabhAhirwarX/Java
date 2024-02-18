class UThread extends Thread {
    public void run() {
        synchronized(X.class) {
            try{ Thread.sleep(100); }catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(Y.class) {
                System.out.println("UThread->run()->synch(X.class)->synch(Y.class)");
            }
        }
    }
}

class VThread extends Thread {
    public void run() {
        synchronized(Y.class) {
            try{ Thread.sleep(100); }catch(InterruptedException e) { e.printStackTrace(); }
            synchronized(X.class) {
                System.out.println("VThread->run()->synch(Y.class)->synch(X.class)");
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        UThread a = new UThread();
        a.setName("A");

        VThread b = new VThread();
        b.setName("B");

        a.start();
        b.start();
    }
}

class X {  }

class Y {  }