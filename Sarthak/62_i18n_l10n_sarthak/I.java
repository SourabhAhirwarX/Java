import java.util.Calendar;
import java.util.Date;

class A {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Date date = new Date(cal.getTimeInMillis());
        System.out.println(date);

        // cal.set(Calendar.DATE, 1);
        // cal.set(Calendar.HOUR, 1);
        // cal.set(Calendar.HOUR, -1);

        date = new Date(cal.getTimeInMillis());
        System.out.println(date);
    }
}