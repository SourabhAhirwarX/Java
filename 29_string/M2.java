class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public boolean equals(Object x) {
        Employee m = this;
        Employee n = (Employee)x;
        
        return m.name.equals(n.name) && m.salary==n.salary;     // And operator is used to check both cases(name & salary)
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Golu", 34000);
        Employee e2 = new Employee("Golu", 34000);
        Employee e3 = new Employee("Golu", 34000);
        Employee e4 = new Employee("Bholu", 34000);
        Employee e5 = new Employee("Golu", 34000);
        Employee e6 = new Employee("Golu", 40000);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));  // calling equal method of Employee class
        System.out.println(e3 == e4);
        System.out.println(e3.equals(e4));
        System.out.println(e5 == e6);
        System.out.println(e5.equals(e6));
    }
}