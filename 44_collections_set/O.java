//  testing all the conditions of equals() method...
//  i.e:-    reflexive, symmetric, transitive and the null test.

class A {
    public static void main(String[] args) {
        Student x = new Student("golu", 12);
        Student y = new Student("golu", 12);
        Student t = new Student("golu", 12);
        Student z = new Student("bholu", 15);

        // null test:
        System.out.println(x.equals(null));
        System.out.println(y.equals(null));
        System.out.println(z.equals(null));

        // consistent:
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));

        // transitive:
        System.out.println(x.equals(y));
        System.out.println(y.equals(t));
        System.out.println(x.equals(t));

        // symmetric:
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));

        // reflexive
        System.out.println(x.equals(x));
        System.out.println(y.equals(y));
        System.out.println(z.equals(z));
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student a = this;
            Student b = (Student)obj;           

            String nm1 = a.name;
            String nm2 = b.name;

            if(nm1.equals(nm2)){
                flag = true;
            }
        }
        return flag;
    }

    public String toString() {
        return name +" ~ "+ age;
    }
}