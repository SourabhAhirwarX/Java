import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

class A {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        // SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);

        String dateStr = sdf.format(date);

        System.out.println(dateStr);
    }
}