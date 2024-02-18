/*
    here, we are using the compareTo() method of the String class
    which will return the int value i.e the difference between the two object
*/

class A {
    public static void main(String[] args) {
        String x = new String("om");
        String y = new String("om");
        String z = new String("ram");

        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(z.compareTo(x));
    }
}