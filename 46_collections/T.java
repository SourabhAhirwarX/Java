/*

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class A {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("gurmeet", 34));
        list.add(new Employee("manpreet", 25));
        list.add(new Employee("preet", 29));
        list.add(new Employee("satpal", 31));
        list.add(new Employee("kuldeep", 23));

        Comparator<Employee> comp = new NameRevSort();

        Collections.sort(list, comp);

        System.out.println(list);

        Employee key = new Employee("balraj", 27);
        System.out.println(Collections.binarySearch(list, key, comp));
    }
}

class NameSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class NameRevSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name);
    }
}

class AgeSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.age.compareTo(e2.age);
    }
}

class AgeRevSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.age.compareTo(e1.age);
    }
}

class Employee {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}