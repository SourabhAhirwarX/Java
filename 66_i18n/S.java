import java.text.NumberFormat;
import java.text.ParseException;

class A {
    public static void main(String[] args) throws ParseException {
        NumberFormat nf = NumberFormat.getInstance();

        System.out.println(nf.parse("564.4353463453"));
        System.out.println(nf.parse("564"));
    }
}