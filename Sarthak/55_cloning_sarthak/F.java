class Student implements Cloneable {
    String name;
    int age;
    Address address;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address {
    String addr;
    String city;
    String state;
}

class A {
    public static void main(String[] args) {
        Address a = new Address();
        a.addr = "64 sai colony";
        a.city = "jabalpur";
        a.state = "MP";

        Student s = new Student();        
        s.name = "om";
        s.age = 12;
        s.address = a;

        try {
            Student e = (Student)s.clone();

            System.out.println(e.address.addr);
            System.out.println(e.address.city);
            System.out.println(e.address.state);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}