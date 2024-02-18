// /*
//     here, we are creating the object of class ArrayList 
//         since, ArrayList is class in util package so, we must have to import it...
//         and then, by using add() method of the Collection interface, we are adding new elements to the list...

//     All reference variable are of object type variable...
// */

class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();       // error: cannot find symbol

        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println(list);
    }
}

/*
import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        int[] arr = new int[12];

        ArrayList list = new ArrayList();

        Integer i = Integer.valueOf(12);
        list.add(i);
        list.add(24);
        list.add(34);
        list.add(64);
        list.add(64);

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        // remove of Collection
        Integer n = Integer.valueOf(34);
        System.out.println(list.remove(n));

        // remove of list
        System.out.println(list.remove(2));

        // contains
        Integer o = Integer.valueOf(64);
        System.out.println(list.contains(o));

        System.out.println(list);
    }
}
*/