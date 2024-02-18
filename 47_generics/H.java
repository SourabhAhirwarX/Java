import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(45);
        x.add(18);

        pro(x);
    }

    static void pro(ArrayList list) {
        System.out.println(list);
    }
}