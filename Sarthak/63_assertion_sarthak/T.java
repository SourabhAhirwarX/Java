class T {
    public static void main(String[] args) {
        
    }   
    
    static public void pro(int y) {
        assert(y < 10):"Some thing is wrong...";
        //inappropriate way of using the assert keyword

        // more code..
    }

    static private void info(int y) {
        assert(y < 10):"Some thing is wrong...";
        //appropriate way of using the assert keyword

        // more code..
    }
}
