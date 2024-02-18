class A {
    public static void main(String[] args) {
        int[] x = {12, 45, 78, 34, 55, 21, 12, 9, 23, 78, 120, 69, 12, 45};
        int evenCount = 0;

        for(int y : x) {
            if(y%2 == 0) {
                evenCount++;
            }
        }
        
        System.out.println(evenCount +" even and "+ (x.length-evenCount) +" odd records");
    }
}