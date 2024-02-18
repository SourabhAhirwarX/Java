// Practice

import java.util.HashSet;

class A {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arun", 24045254);
        Employee e2 = new Employee("Akask", 5254);
        Employee e3 = new Employee("Ajju", 50375);
        Employee e4 = new Employee("Vikash", 8045820);

        Employee x = new Employee("Chaggan", 32545394);
        Employee z = new Employee("Arun", 24045254);
        Employee y = new Employee("Arun", 32545394);

        HashSet<Employee> set = new HashSet<Employee>();

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(y);

        System.out.println(set);

        System.out.println(e1.equals(x));
        System.out.println(e1.equals(y));
        System.out.println(e1.equals(z));
    }
}

class Employee {
    String name;
    int salary;

    static String abc = " abcdefghijklmnopqrstuvwxyz";

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int hashCode() {
        int val = 0;
        for(int i=0; i<name.length(); i++) {
            val += abc.indexOf(name.charAt(i));
        }
        return val;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Employee) {
            if(this.name.equals(((Employee)obj).name)) {
                flag = true;
            }
        }
        return flag;
    }

    public String toString() {
        return name + " ~~~ " + salary;
    }
}