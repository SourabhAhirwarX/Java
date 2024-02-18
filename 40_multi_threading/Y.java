// here, it will give false because we doesn't start this thread

class X implements Runnable{
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        Thread t = new Thread(new X(), "A");
        
        System.out.println(t.isAlive());
    }
}