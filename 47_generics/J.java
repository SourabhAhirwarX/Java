import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Number> a1 = new ArrayList<Integer>();
        ArrayList<? extends Number> a2 = new ArrayList<Float>();
        ArrayList<? extends Number> a3 = new ArrayList<Double>();
        ArrayList<? extends Number> a4 = new ArrayList<Short>();

        System.out.println(a1);        
        System.out.println(a2);        
        System.out.println(a3);        
        System.out.println(a4);        
    }
}