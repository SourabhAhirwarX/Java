import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        int e = Integer.parseInt(args[0]);

        ArrayList<? extends Number> x = null;

        if(e == 1) {
            x = pro();
        } else if(e == 2) {
            x = info();
        }

        for(Number num : x) {
            System.out.println(num);
        }

    }

    static ArrayList<Float> info() {
        ArrayList<Float> list = new ArrayList<Float>();

        list.add(2.4f);
        list.add(5.4f);
        list.add(64.4f);

        return list;
    }

    static ArrayList<Integer> pro() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(18);
        list.add(99);

        return list;
    }
}