import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

class A {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        
        SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.FULL);
        // SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.MEDIUM);
        // SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.LONG);
        // SimpleDateFormat sdf = (SimpleDateFormat)DateFormat.getDateInstance(DateFormat.SHORT);

        String dateStr = sdf.format(date);

        System.out.println(dateStr);
    }
}