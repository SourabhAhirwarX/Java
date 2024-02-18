import java.util.Calendar;

class A {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal);
        System.out.println("++++++++++++++++");
        System.out.println(cal.getTimeInMillis());
    }
}