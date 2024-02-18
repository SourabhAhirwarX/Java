import java.text.NumberFormat;

class A {
    public static void main(String[] args) {
        float x = 4355.34532535436356f;

        NumberFormat nf = NumberFormat.getInstance();

        System.out.println(nf.getMaximumFractionDigits());

        System.out.println(nf.format(x));

        nf.setMaximumFractionDigits(5);

        System.out.println(nf.format(x));
    }
}