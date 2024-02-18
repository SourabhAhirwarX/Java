import java.util.ArrayList;
import java.util.Iterator;

class A {
    public static void main(String[] args) {
        Employee e1 = new Employee("mohan", 45000);
        Employee e2 = new Employee("sohan", 46000);
        Employee e3 = new Employee("gohan", 47000);
        Employee e4 = new Employee("rohan", 48000);
        Employee e5 = new Employee("tohan", 49000);

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println(list);

        Iterator itr = list.iterator();

        while(itr.hasNext()) {
            // Employee emp = (Employee)itr.next();
            // System.out.println(emp);
            System.out.println(itr.next());
        }
    }
}

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "name:"+ name +" ~~~~ " + "salary:" + salary;
    }
}