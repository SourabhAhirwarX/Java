/*
    PriorityQueue class implementation
    - ordered and sorted both
    - duplicate records allowded

    just like the treeSet, but allowed duplicates
*/

import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();

        // q.offer(19);
        // q.offer(15);
        // q.offer(10);
        // q.offer(7);
        // q.offer(13);

        q.offer("om");
        q.offer("yamraj");
        q.offer("om");  // duplicate records allowed
        q.offer("arjun");
        q.offer("arjun");
        q.offer("bheeshm");
        q.offer("duryodhan");

        System.out.println(q);
        
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

        System.out.println(q);
    }
}