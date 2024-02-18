class A {
    public static void main(String[] args) {
        Student[][] x = { 
                            {new Student("Om",12), new Student("rohan", 23)},     // x[0][0]  //x[0][1]
                            {new Student("Om1",13)},    // x[1][0]
                            {new Student("Om2",14)}     // x[2][0]
                        };

        for(Student[] i : x) {
            for(Student j : i) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name+"-"+age;
    }
}