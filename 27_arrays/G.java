// String array are implicitly initialized by default value null
// i.e. object type values are implicitly initialized by the default value null

class A {
    public static void main(String[] args) {
        String[] x = new String[5];
        
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}