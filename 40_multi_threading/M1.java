class MyThread extends Thread {
    public void run() throws InterruptedException {      // error: run() in MyThread cannot implement run() in Runnable
        String tName = Thread.currentThread().getName(); // overridden method does not throw InterruptedException
        for(int i=0; i<100; i++) {
            System.out.println(i+" - "+tName);
            if(i==50) {
                Thread.sleep(200);
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
            System.out.println(i+" - "+tName);
        }
    }
}