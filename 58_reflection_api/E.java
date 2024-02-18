class User {

}

class Student extends User {

}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        Class k1 = klass.getSuperclass();

        System.out.println(k1);
        System.out.println(k1.getName());
    }
}