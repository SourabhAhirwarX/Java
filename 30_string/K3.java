class A {
    public static void main(String[] args) {
        String x = "mohan-56, ganesh-78, vikramaditya-72";
        
        String[] y = x.split("\\d\\d");

        for(String t : y) {
            System.out.println(t);
        }
    }
}