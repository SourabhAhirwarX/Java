class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public boolean equals(Object o) {
        Student m = this;
        Student n = (Student)o;
        
        return m.age == n.age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("raman", 18);
        Student s2 = new Student("raman", 18);

        // in this case equal accessed by the method we have created in Student class so, it is giving true
        System.out.println(s1 == s2);           // false
        System.out.println(s1.equals(s2));      // true
    }
}