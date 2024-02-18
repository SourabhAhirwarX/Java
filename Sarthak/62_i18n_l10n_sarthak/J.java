import java.util.Date;
import java.text.SimpleDateFormat;

class A {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat();

        String dateStr = sdf.format(date);

        System.out.println(dateStr);
    }
}