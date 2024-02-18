// Try all these prioity fiels for setting the priority to the thread...

class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        // t.setPriority(Thread.MAX_PRIORITY);
        // t.setPriority(Thread.MIN_PRIORITY);
        t.setPriority(Thread.NORM_PRIORITY);

        System.out.println(t.getPriority());
    }
}