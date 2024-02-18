abstract class Golu {
    Golu() {
        System.out.println("Constructor calling of abstract constructor");
    }

    public void pro() {
        System.err.println("pro of parent");
    }
}

public class demo extends Golu {
    public void pro() {
        System.out.println("pro of child");
    }

    public static void main(String[] args) {
        demo d = new demo();
        d.pro();
    }
}
