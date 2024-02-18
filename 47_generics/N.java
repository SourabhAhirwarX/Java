import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(12);
        a1.add(16);
        a1.add(124);

        pro(a1);
    }

    static void pro(ArrayList<? extends Number> list) {
        System.out.println(list);
        
        System.out.println(list.remove(2));

        System.out.println(list);
    }
}