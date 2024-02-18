/*  
    here, we wan't to remove the elements of the list 
    by, using the for loop 
    but, in this condition the re-indexing concept works where after each iteration the indexes were resetted...
    so, it remove elements in proper interval.

    Conclution:- Re-Indexing concept works...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add(new String("mohan~"));
        x.add(new String("rohan~"));
        x.add(new String("sohan~"));
        x.add(new String("tohan~"));
        x.add(new String("gohan~"));

        System.out.println(x);

        int size = x.size();

        for(int i=0; i<size; i++) {
            System.out.println(x.remove(i));
        }

        System.out.println(x);
    }
}

/*
    i=0     condition    value
     0         0<5       mohan
     1         1<5       sohan
     2         2<5       gohan
     3         3<5       IOOBE
*/