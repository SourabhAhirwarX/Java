class A {
    public static void main(String[] args) {
        String[] x = new String[3];

        x[0] = "om";        
        x[1] = "ram";        
        x[2] = "shyam";        

        for(int i=0; i<x.length ; i++) {
            System.out.println(x[x.length-1-i]);
        }
    }
}