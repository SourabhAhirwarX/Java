class A {
    public static void main(String[] args) {
        Student x = new Student();

        x.setName("Om");
        x.setAge(12);

        System.out.println(x.name);
        System.out.println(x.age);

        x.setName("ram");
        x.setAge(14);

        System.out.println(x.name);
        System.out.println(x.age);
    }
}

// Creating an Immutable Class
// Step 1: Declare your class final 
// apply modifier final on your class Student 
// Step 2: Declare each variable of your class private
// Step 3: Remove setter methods from your class
final class Student {
    private String name;
    private int age;

    public Student() {

    }
    
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }   
}