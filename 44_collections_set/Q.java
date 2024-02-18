/*
    Implementing hashCode() according to the sum of characters of the particular words.
*/

class A {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 12);
        Student s2 = new Student("ram", 14);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Student {
    String name;
    int age;

    static String abc = " abcdefghijklmnopqrstuvwxyz";

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        int val = 0;

        for(int i=0; i<name.length(); i++) {
            val += abc.indexOf(name.charAt(i));
        }

        return val;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student a = this;
            Student b = (Student)obj;

            String nm1 = a.name;
            String nm2 = b.name;

            if(nm1.equals(nm2)) {
                flag = true;
            }
        }

        return flag;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}