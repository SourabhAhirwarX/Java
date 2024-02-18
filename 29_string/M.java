class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Golu", 34000);
        Employee e2 = new Employee("Golu", 34000);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));      // calling equal method of object class
    }
}