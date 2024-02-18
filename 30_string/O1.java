import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList<String>();

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");

        String y = String.join("#", x);

        System.out.println(y);
    }
}