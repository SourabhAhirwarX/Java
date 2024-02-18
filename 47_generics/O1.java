import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Z> x = new ArrayList<Z>();

        x.add(new Z());
        x.add(new Z());
        x.add(new Z());

        pro(x);
    }

    static void pro(ArrayList<? extends X> list) {
        for(X t : list) {
            System.out.println(t);
        }
    }
}

interface X {       }

class Z implements X {        }
class Y implements X {        }