class Student {

}

class A {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("====================");

        Class klass = Class.forName("Student");

        System.out.println(klass);
    }
}