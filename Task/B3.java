// find the no. of vowels an array contains

class A {
    public static void main(String[] args) {
        char[] x = {'m', 'o', 'h', 'a', 'n', ' ', 'i', 's', ' ', 'a', 'g', 'o', 'a', 'd', ' ', 'b', 'o', 'y'};
        int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
        
        for(int i=0; i<x.length; i++) {
            if( x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u' ) {
                if(x[i]=='a') {
                    counta++;
                }
                else if(x[i]=='e') {
                    counte++;
                }
                else if(x[i]=='i') {
                    counti++;
                }
                else if(x[i]=='o') {
                    counto++;
                }
                else if(x[i]=='u') {
                    countu++;
                }
            }
        }

        System.out.println("a - "+counta);
        System.out.println("e - "+counte);
        System.out.println("i - "+counti);
        System.out.println("o - "+counto);
        System.out.println("u - "+countu);
    }
}