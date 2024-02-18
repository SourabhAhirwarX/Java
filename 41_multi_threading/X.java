/*
    methods:
        ThreadGroup -> getThreadGroup()
        ThreadGoup -> getParent()
*/

class A {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Default Thread Name: " + t.getName());
        System.out.println("Thread Group of Default Thread: " + t.getThreadGroup().getName());
        System.out.println("Parent Thread Group of main Thread Group: " + t.getThreadGroup().getParent().getName());
        System.out.println("Parent Thread Group of system Thread Group: " + t.getThreadGroup().getParent().getParent().getName());
    }
}