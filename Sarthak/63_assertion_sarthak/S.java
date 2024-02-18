class S {
    static int y = 9;
    public static void main(String[] args) {
        pro();

        System.out.println(y);
    }   
    
    static void pro() {
        assert(info()):"Some thing is not correct...";
        //inappropriate way of using the assert keyword
    }

    static boolean info() {
        y = 90;

        return true;
    }
}
