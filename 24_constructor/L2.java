class Student {
    String name;
    int age;

    Student() {
        //super();
        //handle instance level variables
        //associate instance level methods with the current object ..
        System.out.println(name);
        System.out.println(age);
    }
    
    void info() {
        
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}