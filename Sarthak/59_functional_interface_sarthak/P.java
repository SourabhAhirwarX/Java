@FunctionalInterface
interface Abc {
    void pro(int... x);
}

// class O implements Abc {
//     public void pro(int... x) {
//         System.out.println("Hello Duniyawlon");
//     }
// }

// x -> System.out.println("Hello Duniyawlon");



class A {
    public static void main(String[] args) {
        // Abc x = new O();
        Abc a = x -> System.out.println("Hello Duniyawlon"+x.length);

        a.pro(12, 23, 56);
    }
}