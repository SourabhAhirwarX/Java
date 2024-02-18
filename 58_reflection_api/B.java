class Student {

}

class A {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("===========#==========");

        Student st = new Student();

        System.out.println("===========#==========");

        Class klass = st.getClass();

        System.out.println(klass);
    }
}