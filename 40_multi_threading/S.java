class Y implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + t.getName() + " yielding");
            Thread.yield();
        }
    }
}

class A {
    public static void main(String[] args) {
        Thread e = new Thread(new Y(), "A");
        // e.setPriority(10);
        e.setName("Guru_bro");
        e.start();

        Thread t = Thread.currentThread();
        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}