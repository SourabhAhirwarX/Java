// print all the vowels

class A {
    public static void main(String[] args) {
        char[] x = {'m', 'o', 'h', 'a', 'n', ' ', 'i', 's', ' ', 'a', 'g', 'o', 'a', 'd', ' ', 'b', 'o', 'y'};

        for(int i=0; i<x.length; i++) {
            if( x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u' /*|| x[i]==' '*/ ) {
                System.out.println("Vowel: "+x[i]+"-"+(i+1));
            }
        }
    }
}