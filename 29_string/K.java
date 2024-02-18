class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("raman", 18);
        Student s2 = new Student("raman", 18);

        // in this case equal method inherited by Object class so, it is giving false
        System.out.println(s1 == s2);             // false, neighter two objects are pointing on same object
        System.out.println(s1.equals(s2));        // false, nor their content is same
    }
}