class A {
    public static void main(String[] args) {
        Student x = new Student("ganesh", 15);

        
        System.out.println(x.getName());
        System.out.println(x.getAge());
    }
}

// Creating an Immutable Class
// Step 1: Declare your class final (apply modifier final on your class Student )
// Step 2: Declare each variable of your class private
// Step 3: Remove setter methods from your class
// Step 4: Initialize the properties of your class using a constructor

//step 1:
final class Student {
    
    //step 2:
    private String name;
    private Integer age;

    // public Student() {

    // }

    //step 4:
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    
    public String getName() {
        return name;
    }    
    
    public int getAge() {
        return age;
    }

    //step 3:
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }   
}