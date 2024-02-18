import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String college() default "JEC";
    int sem() default 1;
}

@Info(sem=7)
class Student {
    String name;
    int age;
}

class A {
    public static void main(String[] args) {
        Student x = new Student();

        x.name = "Jay";
        x.age = 21;

        Class klass = x.getClass();

        Object o = klass.getAnnotation(Info.class);

        Info info = (Info)o;

        System.out.println(info.college());
        System.out.println(info.sem());
    }
}