// By default compiler attach this package to each source file, 
// when there is any use of this package in it
// default import statement
// import java.lang.*;

import java.util.Date;
// import java.sql.Date;

public class D {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}