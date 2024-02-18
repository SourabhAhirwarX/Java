class User {
    String name;
}

class Employee extends User implements Cloneable {
    int age;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class A {
    public static void main(String[] args)  {
        Employee emp = new Employee();
        emp.age = 33;
        emp.name = "jay";

        try {
            Employee e = (Employee)emp.clone();
            
            System.out.println(e.name);
            System.out.println(e.age);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}