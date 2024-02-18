/*

*/

import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>();

        map.put(new Employee("mahesh", 34), 34000);
        map.put(new Employee("ganesh", 28), 28000);
        map.put(new Employee("suresh", 22), 22000);
        map.put(new Employee("mangesh", 42), 42000);

        System.out.println(map);
    }
}

class Employee implements Comparable {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object obj) {
        Employee e1 = this;
        Employee e2 = (Employee)obj;

        String nm1 = e1.name;
        String nm2 = e2.name;

        return nm1.compareTo(nm2);  // comparing the String values 
    }

    public String toString() {
        return name + " ~ " + age;
    }
}