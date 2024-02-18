class A {
    public static void main(String[] args) {
        try{
            char a = 'r';
            char b = 'a';
            char c = '\r';
            char d = 'm';

            System.out.print(a);
            Thread.sleep(2000);
            System.out.print(b);
            Thread.sleep(2000);
            System.out.print(c);
            Thread.sleep(2000);
            System.out.print(d);
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}