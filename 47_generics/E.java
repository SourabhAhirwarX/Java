import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(12);
        a.add(45);
        a.add(true);    // error: incompatible types: boolean cannot be converted to Integer
    }
}