class Prime {
    public static void main(String[] args) {
        int n = 17;
        boolean flag = false;
        int m = n/2;

        if(n==0 || n==1) {
            System.out.println("non prime");
            System.exit(0);
        } else {
            for(int i=2; i<=m; i++) {
                if(n%i == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println("non prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}