import java.util.PriorityQueue;

class A {
    public static void main(String[] args) {
        PriorityQueue ps = new PriorityQueue();

        ps.offer(12);
        ps.offer(83);
        ps.offer(23);
        ps.offer(12);

        // remove
        System.out.println(ps.poll());
        System.out.println(ps.poll());
        System.out.println(ps.poll());
        
        // print
        System.out.println(ps.peek());
        System.out.println(ps.peek());
        System.out.println(ps.peek());

        System.out.println(ps);
    }
}