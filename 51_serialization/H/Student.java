class Student implements java.io.Serializable {
    String name;
    int age;
    transient float marks = 89.45f;
    transient String degree = "MTech";
}