import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

class A {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(12);
        al.add(56);
        al.add(90);
        al.add(12);
        al.add(11);

        System.out.println(al);
        
        Vector v = new Vector();
        
        v.add(23);
        v.add(223);
        v.add(53);
        v.add(89);
        
        System.out.println(v);
        
        LinkedList ls = new LinkedList();

        ls.add(23);
        ls.add(223);
        ls.add(53);
        ls.add(89);

        System.out.println(ls);

        HashSet hs = new HashSet();

        hs.add("rohan");
        hs.add("gohan");
        hs.add("sohan");
        hs.add("iohan");
        hs.add("gohan");

        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("rohan");
        lhs.add("gohan");
        lhs.add("sohan");
        lhs.add("iohan");
        lhs.add("gohan");

        System.out.println(lhs);

        TreeSet ts = new TreeSet();

        ts.add("rohan");
        ts.add("gohan");
        ts.add("sohan");
        ts.add("iohan");
        ts.add("gohan");

        System.out.println(ts);
    }
}