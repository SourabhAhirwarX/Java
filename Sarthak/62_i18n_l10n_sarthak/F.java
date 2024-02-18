import java.util.Calendar;
import java.util.Date;

class A {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTimeInMillis());
        System.out.println("++++++++++++++++");

        Date date = new Date(cal.getTimeInMillis());
        System.out.println(date);
    }
}