import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Number> x = pro();

        for(Number num : x) {
            System.out.println(num);
        }

    }

    static ArrayList<Integer> pro() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(18);
        list.add(99);

        return list;
    }
}