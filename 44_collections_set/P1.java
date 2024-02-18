/*
    sum of characters of the words we provides.
    i.e.  ram = 32
        mohan = 51
*/

class A {
    static String abc = " abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        // String name = "mohan";
        String name = "ram";

        int val = 0;

        for(int i=0; i<name.length(); i++) {
            val += abc.indexOf(name.charAt(i));
        }

        System.out.println(val);
    }
}