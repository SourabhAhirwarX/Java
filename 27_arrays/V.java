import java.io.Console;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student Name: "+name+" - Student Age: "+age;
    }
}

class A {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("How many student records: ");
        String input = con.readLine();
        int count = Integer.parseInt(input);

        Student[] x = new Student[count];

        for(int i=0; i<count; i++) {
            System.out.print("Enter your name: ");
            String name = con.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(con.readLine());

            x[i] = new Student(name, age);
        }
        
        System.out.println("#######################################");

        for(Student y : x) {
            System.out.println(y);
        }
    }
}

// import java.util.Scanner;

// class A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("How many student records: ");
//         String input = sc.nextInt();
//         sc.close();

//         int count = Integer.parseInt(input);

    // Student[] x = new Student[count];

    // for(int i=0; i<count; i++) {
    //     System.out.print("Enter your name: ");
    //     String name = con.readLine();

    //     System.out.print("Enter your age: ");
    //     int age = Integer.parseInt(con.readLine());

    //     x[i] = new Student(name, age);
    // }

    // System.out.println("#######################################");

    // for(Student y : x) {
    //     System.out.println(y);
    // }
//     }
// }