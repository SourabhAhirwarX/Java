import java.util.ArrayList;
import java.util.Map;

class A {
    public static void main(String[] args) {
        ArrayList<?> a1 = new ArrayList<Student>();
        ArrayList<?> a2 = new ArrayList<Object>();
        ArrayList<? extends Object> a3 = new ArrayList<Employee>();
        ArrayList<? extends Object> a4 = new ArrayList<Bus>();
        ArrayList<? extends Object> a5 = new ArrayList<Integer>();
        ArrayList<? extends Object> a6 = new ArrayList<User>();
        ArrayList<? extends Object> a7 = new ArrayList<Map>();

        // a1.add(new Student());
    }
}

interface User {        }

class Student implements User{      }
class Employee implements User {        }
class Bus {     }