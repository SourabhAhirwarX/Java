import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends X> list1 = new ArrayList<Z>();
        ArrayList<? extends X> list2 = new ArrayList<Y>();
    }
}

interface X {       }

class Z implements X {        }
class Y implements X {        }