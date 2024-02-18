class A {
    public static void main(String[] args) {
        String x = "mohan";

        System.out.println(x);
        x = "om";

        System.out.println(x);
    }
}

// reference variable is still Modifiable
// here new String Object with value mohan is still there inside the String constant pool
// along with the string object containing om