class A {
    public static void main(String[] args) {
        String[] x = new String[3];

        x[0] = "om";        
        x[1] = "ram";        
        x[2] = "shyam";        

        // no. in reverse order
        for(int i=x.length-1; i>=0; i--) {
            System.out.println(i);
        }
        
        // reverse order
        for(int i=x.length-1; i>=0; i--) {
            System.out.println(x[i]);
        }

        // Printing elements in reverse order by iterating in forward direction
        for(int i=0; i<x.length; i++) {
            System.out.println(x[x.length-i-1]);
        }
    }
}