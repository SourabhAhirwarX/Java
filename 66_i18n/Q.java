import java.util.Locale;

class A {
    public static void main(String[] args) {
        Locale brazil = new Locale("pt", "BR");     // Brazil
        Locale denmark = new Locale("da", "DK");     // Denmark
        Locale italy = new Locale("it", "IT");     // Italy

        System.out.println(brazil.getDisplayCountry());
        System.out.println(brazil.getDisplayCountry(brazil));

        System.out.println(denmark.getDisplayCountry());
        System.out.println(denmark.getDisplayCountry(denmark));

        System.out.println(italy.getDisplayCountry());
        System.out.println(italy.getDisplayCountry(italy));
    }
}