import java.text.NumberFormat;

class A {
    public static void main(String[] args) {
        float x = 345.567890f;

        // NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        int maxFractionDigits = nf.getMaximumFractionDigits();

        System.out.println(maxFractionDigits);

        System.out.println(nf.format(x));
        
        nf.setMaximumFractionDigits(4);
        
        System.out.println(nf.format(x));
    }
}