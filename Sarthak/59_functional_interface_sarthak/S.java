abstract class Efg {
    abstract void pro();
} 

class A {
    public static void main(String[] args) {
        Efg x = () ->  System.out.println("Hiiiii"); 

        x.pro();
    }
}