/*
    here, we are creating the list of different collection i.e. classes and interface like ArrayList, LinkedList, Vector, Stack, Queue...
    using different methods of these collections we can add, remove and iterate between the list...

    Conclution:- uses the methods of same class/interface for their proper functioning.
*/

import java.util.LinkedList;

class A {
    public static void main(String[] args) {
        LinkedList Ll = new LinkedList();

        // List - add(), get(), set(), remove()
        Ll.add(34);
        Ll.add(45);
        Ll.add(18);
        Ll.add(24);

        // System.out.println(Ll.remove(0));
        // System.out.println(Ll.remove(0));
        // System.out.println(Ll.get(0));
        // System.out.println(Ll.get(2));


        // Stack - push(), peek(), pop()
        Ll.push(45);
        Ll.push(18);
        Ll.push(17);

        // System.out.println(Ll.pop());
        // System.out.println(Ll.pop());
        // System.out.println(Ll.peek());


        // Queue - offer(), peek(), poll()
        Ll.offer(45);
        Ll.offer(17);
        Ll.offer(18);

        System.out.println(Ll.peek());
        System.out.println(Ll.peek());
        System.out.println(Ll.peek());

        System.out.println(Ll.poll());
        System.out.println(Ll.poll());
        System.out.println(Ll.poll());
        System.out.println(Ll.poll());
        System.out.println(Ll.poll());
        System.out.println(Ll.poll());

        System.out.println(Ll);
    }
}