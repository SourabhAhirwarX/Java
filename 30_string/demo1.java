class A {
    public static void main(String[] args) {
        String str = "mohan kumar roy";
        String abc = "aeiou";

        // for(int i=0; i<abc.length(); i++) {
        //     int count = 0;
        //     for(int j=0; j<str.length(); j++) {
        //         if(abc.charAt(i) == str.charAt(j)) {
        //             count++;
        //         }
        //     }
        //     System.out.println(abc.charAt(i) + " ~ " + count);
        // }

        for(char c : abc.toCharArray()) {
            int count = 0;
            for(char a : str.toCharArray()) {
                if(c == a) {
                    count++;
                }
            }
            if(count > 0) {
                System.out.println(c + " ~ " + count);
            }
        }
    }   
}