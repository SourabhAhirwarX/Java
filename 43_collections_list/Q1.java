/*
    here, we wan't to remove the elements of the list 
    by, using the for loop 
    but, in this condition the re-indexing concept works where after each iteration the indexes were resetted...
    so, it remove the elements in proper interval 

    since, here we are storing the size in the size variable i.e. 5
    so, it will iterate the loop 5 times where the indexes not found because, of re-indexing
        therefore it will generates Exception: IndexOutOfBoundsException

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

        for(int i=0; i<size; i++) {             // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
            System.out.println(x.remove(i));
        }

        System.out.println(x);
    }
}