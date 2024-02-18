import java.util.Locale;

class A {
    public static void main(String[] args) {
        // Locale locale = new Locale("de", "DE");
        Locale locale = new Locale("fr", "FR");

        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }
}