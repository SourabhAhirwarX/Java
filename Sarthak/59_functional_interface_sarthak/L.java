@FunctionalInterface
interface Abc {
    void pro(int a);
}

// class Y implements Abc {
//     public void pro(int a) {
//         System.out.println("Hello Ji " + a);
//     }
// }

// public void pro(int a) {
//     System.out.println("Hello Ji " + a);
// }

//  a -> System.out.println("Hello Ji " + a);


class A {
    public static void main(String[] args) {
        // Abc x = new Y();
        Abc x = a -> System.out.println("Hello Ji " + a);

        x.pro(77);
    }
}