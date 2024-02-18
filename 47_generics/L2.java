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
        info(a2);
    }

    static void pro(ArrayList<Integer> list) {
        for(Integer tmp : list) {
            System.out.println(tmp);
        }
    }

    static void info(ArrayList<Float> list) {
        for(Float tmp : list) {
            System.out.println(tmp);
        }
    }
}