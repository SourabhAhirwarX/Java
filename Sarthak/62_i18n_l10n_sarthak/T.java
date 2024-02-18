import java.text.NumberFormat;
import java.util.Locale;

class A {
    public static void main(String[] args) {
        float x = 345.567890f;

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        int maxFractionDigits = nf.getMaximumFractionDigits();

        System.out.println(maxFractionDigits);

        System.out.println(nf.format(x));
        
        nf.setMaximumFractionDigits(4);
        
        System.out.println(nf.format(x));
    }
}