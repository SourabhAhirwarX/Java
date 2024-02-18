//  equals() method implementing...
//  by using instanceOf operator...

class A {
    public static void main(String[] args) {
        Student x = new Student("golu", 45);

        A y = new A();

        System.out.println(x.equals(y));
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
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
    */

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            return this.name.equals(((Student)obj).name);
        }

        return false;
    }

    public String toString() {
        return name +" ~ "+ age;
    }
}