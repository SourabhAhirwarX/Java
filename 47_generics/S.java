import java.util.ArrayList;
import java.util.Map;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Object> list1 = new ArrayList<Student>();
        ArrayList<? extends Object> list2 = new ArrayList<Employee>();
        ArrayList<? extends Object> list3 = new ArrayList<Bus>();
        ArrayList<? extends Object> list4 = new ArrayList<Integer>();
        ArrayList<? extends Object> list5 = new ArrayList<User>();
        ArrayList<? extends Object> list6 = new ArrayList<Map>();
    }
}

interface User {        }

class Student implements User{      }
class Employee implements User {        }
class Bus {     }