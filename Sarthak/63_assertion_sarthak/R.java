class R {
    public static void main(String[] args) {
        int x = 3;

        switch(x) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hello");
                break;
            default:
                assert(x>2):"Some thing is wrong...";
                //appropriate way of using the assert keyword
        }
    }
}