// sleep(ms) vs join(ms)

class X extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(i+" X");
        }
    }
}

class Y extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(i+" Y");
        }
    }
}

class Z extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(i+" Z");
        }
    }
}

class A {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        x.start();
        y.start();
        z.start();

        try{
            x.join(20);
            // x.sleep(20);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0; i<100; i++) {
            System.out.println(i+" main");
        }
    }
}