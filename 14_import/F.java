import java.sql.Date;
import java.util.Date;

class A {
    public static void main(String[] args) {
        Date date = new Date(81179679769L);    // i want to use java.sql.Date
        System.out.println(date);

        Date dt = new Date();                       // i want to use java.util.Date
        System.out.println(dt);
    }
}

// error: reference to Date is ambiguous
// both class java.sql.Date in java.sql and class java.util.Date in java.util match