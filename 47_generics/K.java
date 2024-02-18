import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Number> a1 = new ArrayList<Integer>();
        
        a1.add(45);
    }
}

// error: incompatible types: int cannot be converted to CAP#1