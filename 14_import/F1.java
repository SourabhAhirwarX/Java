import java.sql.Date;

class A {
    public static void main(String[] args) {
        Date date = new Date(811796579764L);    // i want to use java.sql.Date
        System.out.println(date);

        java.util.Date dt = new java.util.Date();   // i want to use java.util.Date
        System.out.println(dt);
    }
}