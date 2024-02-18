import java.util.ArrayList;
import java.util.Map;
 
class A {
    public static void main(String[] args) {
        // ArrayList<Object> a1 = new ArrayList<Student>();
        // ArrayList<Object> a1 = new ArrayList<Integer>();
        // ArrayList<Object> a1 = new ArrayList<Bus>();

        ArrayList<Object> a1 = new ArrayList<Object>();

        a1.add(new Student());
        a1.add(new Employee());
        a1.add(new Bus());
    }
}

interface User {        }

class Student implements User{      }
class Employee implements User {        }
class Bus {     }


// error: incompatible types: ArrayList<Student> cannot be converted to ArrayList<Object>