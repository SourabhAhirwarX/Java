class A {
    public static void main(String[] args) {
        String s = "rohan, gohan, sohan, mohan, tohan";

        String[] arr = s.split(", ");

        for(String st : arr) {
            System.out.println(st);
        }
    }
}