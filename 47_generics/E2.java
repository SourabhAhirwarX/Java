import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(45);
        
        Integer x = list.get(0);

        System.out.println(x);
    }
}