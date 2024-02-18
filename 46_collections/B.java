/*

*/

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("press 1: NAscSort\npress 2: NDscSort\npress 3: AAscSort\npress 4: ADscSort\n");
        int val = sc.nextInt();

        Comparator<Employee> comp = null;
        switch (val) {
            case 1:
                comp = new NAscSort();
                break;
            case 2:
                comp = new NDscSort();
                break;
            case 3:
                comp = new AAscSort();
                break;
            case 4:
                comp = new ADscSort();
                break;
            default:
                System.out.println("Sorry invalid choice!!!");
                break;
        }

        if(comp != null) {
            TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>(comp);

            map.put(new Employee("mahesh", 34), 34000);
            map.put(new Employee("gahesh", 28), 28000);
            map.put(new Employee("suresh", 22), 22000);
            map.put(new Employee("mangesh", 42), 42000);

            System.out.println(map);
        }
    }
}

class NAscSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class NDscSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name);
    }
}

class AAscSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.age.compareTo(e2.age);
    }
}

class ADscSort implements Comparator<Employee> {
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