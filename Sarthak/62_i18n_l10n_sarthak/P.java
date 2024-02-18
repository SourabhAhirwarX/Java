import java.text.NumberFormat;
import java.util.Locale;

class A {
    public static void main(String[] args) {
        int x = 456789123;

        // NumberFormat nf = NumberFormat.getInstance();
        // NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        // NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nf = NumberFormat.getInstance(new Locale("hi", "IN"));

        String fnum = nf.format(x);

        System.out.println(x);
        System.out.println(fnum);
    }
}