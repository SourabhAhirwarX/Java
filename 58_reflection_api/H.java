import java.lang.reflect.Field;

class Student {
    int y;
    public float j = 5.6f;
    String w;
    public Integer q = 23;
}

class A {
    public static void main(String[] args) throws IllegalAccessException {
        Student st = new Student();
        st.j = 11.23f;
        st.q = 89;
        
        Class klass = Student.class;

        Field[] fields = klass.getFields();

        for(Field fl : fields) {
            System.out.println(fl.getName()+"  -> "+fl.get(st));
        }
    }
}