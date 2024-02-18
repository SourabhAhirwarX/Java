@FunctionalInterface
interface Golu {
    int info(int a, int b);
}

// class H implements Golu {
//     public int info(int a, int b) {
//         int sum = 0;
//         sum = a + b;
//         return sum;
//     }
// }

// public int info(int a, int b) {
//     int sum = 0;
//     sum = a + b;
//     return sum;
// }

// (a, b) -> {
//     int sum = 0;
//     sum = a + b;
//     return sum;
// }

class A {
    public static void main(String[] args) {
        // Golu golu = new H();
        Golu golu = (a, b) -> {
            int sum = 0;
            sum = a + b;
            return sum;
        };

        // int y = golu.info(7, 8);
        // float y = golu.info(7.0, 8.0);
        System.out.println(y);
    }
}