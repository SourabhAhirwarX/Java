// Disclaimer: it will gone to block state
// written back by using ctrl + c 
// it is the condition of deadlock where there is resources unavailability;

class A {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();

        t.join();

        System.out.println("What happens!");
    }
}