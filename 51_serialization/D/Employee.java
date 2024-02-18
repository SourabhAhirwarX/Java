class Employee implements java.io.Serializable {
    String name;
    int age;
    Address address;
    
    Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}