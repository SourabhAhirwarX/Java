import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();

        list.add(Integer.valueOf(12));
        list.add(Float.valueOf(12.34f));
        list.add(Double.valueOf(4.5));

        System.out.println(list);
    }
}