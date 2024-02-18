import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add(12);
        a.add(45);
        a.add(true);    

        System.out.println(a);

        // Integer x = a.get(0);   // since, without providing the type safety it will considered its objects as of Object type, so we have to type cast them

        Integer y = (Integer)a.get(0);  // Type casting
    }
}

// error: incompatible types: Object cannot be converted to Integer