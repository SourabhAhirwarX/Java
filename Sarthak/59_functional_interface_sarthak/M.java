@FunctionalInterface 
interface Mno {
    void add(int a, int b);
}

// class Z implements Mno {
//     public void add(int x, int y) {
//         System.out.println(x + y);
//     }
// }

// public void add(int x, int y) {
//     System.out.println(x + y);
// }

// (x, y) -> System.out.println(x + y);

class A {
    public static void main(String[] args) {
        // Mno x = new Z();
        Mno a = (x, y) -> System.out.println(x + y);

        a.add(55, 33);
    }
}