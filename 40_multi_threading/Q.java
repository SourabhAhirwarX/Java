// when we pass the greater value i.e the value out of the range(0-10)
// then, in that case it will generate IllergalArgumentException...

class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        // t.setPriority(3);
        t.setPriority(11);

        System.out.println(t.getPriority());
    }
}

// Exception in thread "main" java.lang.IllegalArgumentException