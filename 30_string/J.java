class A {
    public static void main(String[] args) {
        String x = "vikramaditya";

        char[] y = x.toCharArray();

        for(char t : y) {
            System.out.print(t+" ");
        }
    }
}

// String x = "mohan";
// char[] arr = x.toCharArray();
// char[] rev = new char[arr.length];

// for(int i=0; i<arr.length; i++) {
//     rev[arr.length - i - 1] = arr[i];
// }

// String y = String.valueOf(rev);