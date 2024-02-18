@FunctionalInterface
interface Qqr {
    int info(int a, int b);
}

// class T implements Qqr {
//     public int info(int m, int n) {
//         return m + n;
//     }
// }

// public int info(int m, int n) {
//     return m + n;
// }

// (m, n) -> m + n;

class A {
    public static void main(String[] args) {
        // Qqr w = new T();
        Qqr w = (m, n) -> m + n;

        int res = w.info(11, 20);

        System.out.println(res + " ~~~");
    }
}