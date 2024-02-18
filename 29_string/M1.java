class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // overriding equals method of Object class
    public boolean equals(Object x) {
        Employee m = this;
        Employee n = (Employee)x;

        return m.salary == n.salary;      // OR operator is used for primitive type variables(int)
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Golu", 34000);
        Employee e2 = new Employee("Golu", 34000);
        // Employee e1 = new Employee("Golu", 34000);
        // Employee e2 = new Employee("Bholu", 34000);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));  // calling equal method of Employee class
    }
}