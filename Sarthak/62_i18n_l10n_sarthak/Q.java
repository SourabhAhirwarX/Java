import java.text.NumberFormat;
import java.util.Locale;

class A {
    public static void main(String[] args) {
        // float x = 3456.456455f;
        int x = 34563;

        // NumberFormat nf = NumberFormat.getCurrencyInstance();
        // NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMAN);

        String cfr = nf.format(x);

        System.out.println(x);
    }
}