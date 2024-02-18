import java.util.Locale;

class A {
    public static void main(String[] args) {
        // Locale loc = new Locale("fr", "FR");
        // Locale loc = new Locale("hi", "IN");
        // Locale loc = new Locale("en", "US");
        Locale loc = new Locale("de", "DE");
        
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getDisplayCountry());
    }
}