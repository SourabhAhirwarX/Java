import java.util.Calendar;
import java.util.Date;

class A {
    static String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Date: " + cal.get(Calendar.DATE));
        System.out.println("MONTH: " + months[cal.get(Calendar.MONTH)]);
        System.out.println("YEAR: " + cal.get(Calendar.YEAR));
        System.out.println("Day of Year: " + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week of Month: " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Week of Year: " + cal.get(Calendar.WEEK_OF_YEAR));
    }
}