@FunctionalInterface
interface Abc {
    void pro();
}

// class X implements Abc {
//     public void pro() {
//         System.out.println("Hello");
//     }
// }

// public void pro() {
//     System.out.println("Hello");
// }

// () -> System.out.println("Hello");


class A {
    public static void main(String[] args) {
        // Abc x = new X();
        Abc x = () -> System.out.println("Hi");

        x.pro();
    }
}