import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(12);
        a1.add(16);
        a1.add(124);

        ArrayList<Float> a2 = new ArrayList<Float>();
        a2.add(2.34f);
        a2.add(4.54f);
        a2.add(6.3f);

        pro(a1);
        pro(a2);
    }

    static void pro(ArrayList<? extends Number> list) {
        for(Number tmp : list) {
            System.out.println(tmp);
        }
    }
}