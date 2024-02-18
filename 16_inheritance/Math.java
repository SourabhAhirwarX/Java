public class Math {
    static void add(int a, int b) {
        System.out.println(a+b);
    }

    /*static*/void mul(int a, int b) {
        System.out.println(a*b);
    }
    
    public static void main(String[] args) {
        add( 45, 18);    
        // mul(5, 2);  // error: non-static method mul(int,int) cannot be referenced from a static context

        // solution for upper problem
        Math x = new Math();
        x.mul(45, 18);
    }
}