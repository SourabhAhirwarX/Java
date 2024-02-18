import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Course {
    String name();
    int duration();
    String teacher();
}

@Course (name="Java", duration=120, teacher="Golu Prasad")
class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "bunty";
        x.age = 12;

        System.out.println(x.name);
        System.out.println(x.age);

        Class cl = x.getClass();
        Annotation ano = cl.getAnnotation(Course.class);

        Course cr = (Course)ano;
        System.out.println(cr.name());       
        System.out.println(cr.duration());       
        System.out.println(cr.teacher());
    }
}