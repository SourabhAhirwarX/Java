/*
    implementing hashCode() and equals() method of Object class...
    hashCode() ->  we can assign a particular values to are object so, on the basis of that we can equate them.

    here, we have implemented hashCode() on the basis of the length of String.
*/

class A {
    public static void main(String[] args) {
        Student s1 = new Student("mohan", 12);
        Student s2 = new Student("ram", 14);
        Student s3 = new Student("ram", 11);
        Student s4 = new Student("hamno", 17);

        // test 1:
        // hashCode() will always be same for same object...
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());

        // test 2:
        System.out.println(s2.equals(s3));  // equals() method implemented on the basis of name.
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        // test 3.a:
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // test 3.b:
        System.out.println(s1.equals(s4));
        System.out.println(s1.hashCode());   // diffrent objects but same hashCode() i.e 51
        System.out.println(s4.hashCode());   // diffrent objects but same hashCode() i.e 51
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
        if(obj instanceof Student) {
            return this.name.equals(((Student)obj).name);
        }

        return false;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}