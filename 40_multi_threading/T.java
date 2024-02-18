class X extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0; i<500; i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class A {
    public static void main(String[] args) throws InterruptedException {
        X e = new X();
        e.setName("A");
        e.start();

        Thread t = Thread.currentThread();
        for(int i=0; i<50; i++) {
            System.out.println(i + " - " + t.getName());
            if(i==25) {
                System.out.println(i + " - " + t.getName() + " is joining thread: " + e.getName());
                e.join();
            }
        }
    }
}