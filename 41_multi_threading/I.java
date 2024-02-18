class X implements Runnable {
    public void run() {
        A.a.pro1();
    }
}

class Y implements Runnable {
    public void run() {
        A.a.pro2();
    }
}

class A {
    static Z a = new Z();
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new X(), "A");
        Thread t2 = new Thread(new Y(), "B");

        t1.start();
        t2.start();
    }
}

class Z {
    synchronized static void pro1() {
        for(int i=0; i<10; i++) {
            System.out.println(i+" - "+Thread.currentThread().getName());
        }
    }

    synchronized static void pro2() {
        for(int i=0; i<10; i++) {
            System.out.println(i+" - "+Thread.currentThread().getName());
        }
    }
}