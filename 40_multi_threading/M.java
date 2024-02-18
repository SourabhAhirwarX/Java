class MyThread extends Thread {
    public void run() {
        String tName = Thread.currentThread().getName();
        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + tName);
            if(i==50) {
                Thread.sleep(200);      // error: unreported exception InterruptedException; must be caught or declared to be thrown
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("monu_bhai");
        t.start();

        String tName = Thread.currentThread().getName();
        for(int i=0; i<100; i++) {
            System.out.println(i + " - " + tName);
        }
    }
}