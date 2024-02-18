class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class A {
    public static void main(String[] args) {
        MyThread x1 = new MyThread();
        x1.setName("golu");
        MyThread x2 = new MyThread();
        MyThread x3 = new MyThread();

        x1.start();
        x2.start();
        x3.start();

        System.out.println("Printing => Name, Priority, Id");

        System.out.println(Thread.currentThread().getName());

        System.out.println(x1.getName());
        System.out.println(x2.getName());
        System.out.println(x3.getName());

        System.out.println(x1.getPriority());
        System.out.println(x2.getPriority());
        System.out.println(x3.getPriority());

        System.out.println(x1.getId());
        System.out.println(x2.getId());
        System.out.println(x3.getId());
    }
}

// Thread Shedular decides to allocate running stage for particular thread