import java.lang.reflect.Constructor;

class Employee {
    String name;
    int age;
}

class A {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee();

        Class klass = Employee.class;
    
        Constructor[] arr = klass.getDeclaredConstructors();

        Employee e2 = (Employee)arr[0].newInstance();

        // System.out.println(e1);
        // System.out.println(e2);

        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}