// last modified value will be overridded in case of static field...
// so only mark the field which were common and u don't wanna modify them
// because of that reason it is suggested to mark the fields as final with static

class Student {
    static String name;
    static int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "mohan";
        s1.age = 12;
        
        Student s2 = new Student();
        s2.name = "ram";
        s2.age = 18;

        System.out.println(s1.name);    // ram
        System.out.println(s1.age);
        System.out.println(s2.name);    // ram
        System.out.println(s2.age);

        System.out.println(Student.maxAge);
    }
}