import java.util.Locale;

class A {
    public static void main(String[] args) {
        Locale locBR = new Locale("pt", "BR");
        Locale locIT = new Locale("it", "IT");
        Locale locDN = new Locale("da", "DK");
        
        System.out.println(locBR.getDisplayLanguage());
        System.out.println(locBR.getDisplayCountry());
        
        System.out.println(locBR.getDisplayLanguage(locIT));
        System.out.println(locBR.getDisplayCountry(locIT));

        System.out.println(locBR.getDisplayLanguage(locDN));
        System.out.println(locBR.getDisplayCountry(locDN));
    }
}