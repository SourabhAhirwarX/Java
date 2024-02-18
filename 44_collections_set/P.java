/*
    getting the indexes of the alphabet of our word
                char  ->  charAt(index)
                index ->  indexOf(char)
                index -> indexOf(String)
*/

// starting the way towards implementing hashcode()

class A {
    static String abc = " abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String name = "mohan";

        System.out.println(abc.indexOf("o"));   // String parameterised
        System.out.println(abc.indexOf('m'));    // char parameterised

        for(int i=0; i<name.length(); i++) {
            // System.out.println(name.charAt(i));
            
            char x = name.charAt(i);
            System.out.println(x + " ~ " + abc.indexOf(x));
        }
    }
}