import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> recs = new ArrayList<Integer>();
        recs.add(56);
        recs.add(98);
        recs.add(34);
        recs.add(67);
        recs.add(78);

        Student x = new Student("ganesh", 15, recs);

        ArrayList<Integer> t = x.getMarks();

        System.out.println(x.getName());
        System.out.println(x.getAge());
        System.out.println(x.getMarks());
        
        t.add(100);
        t.remove(Integer.valueOf(34));

        
        System.out.println(x.getName());
        System.out.println(x.getAge());
        System.out.println(x.getMarks());
    }
}

// Creating an Immutable Class
// Step 1: Declare your class final 
// apply modifier final on your class Student 
// Step 2: Declare each variable of your class private
// Step 3: Remove setter methods from your class
// Step 4: Initialize the properties of your class using a constructor

//step 1:
final class Student {
    
    //step 2:
    private String name;
    private Integer age;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    // public Student() {

    // }

    //step 4:
    public Student(String name, Integer age, ArrayList<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    
    
    public String getName() {
        return name;
    }    
    
    public int getAge() {
        return age;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    //step 3:
    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }   
}