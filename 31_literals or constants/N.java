class A {
    public static void main(String[] args) {
        try{
            char a = 'r';
            char b = 'a';
            char c = '\b';
            char d = 'm';

            System.out.println(a);
            Thread.sleep(2000);

            System.out.println(b);
            Thread.sleep(2000);

            System.out.println(c);
            // System.out.println("~"+c+"~");
            Thread.sleep(2000);
            
            System.out.println(d);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}