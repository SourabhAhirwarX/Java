import java.text.NumberFormat;

class A {
    public static void main(String[] args) {
        float x = 345.567890f;

        NumberFormat nf = NumberFormat.getInstance();

        int maxFractionDigits = nf.getMaximumFractionDigits();

        System.out.println(maxFractionDigits);

        System.out.println(nf.format(x));
        
        nf.setMaximumFractionDigits(2);
        
        System.out.println(nf.format(x));
    }
}