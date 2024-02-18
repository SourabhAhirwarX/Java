/*
    here, we are using the set() method were the element of list will be replaced by value we want to replace at that particular index
        Cases:  1. x.set(2,22);  =>  it will replace the value at 2 position with the value we have passed in set method 
                2. x.set(4,22);  =>  Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
                
                                interface  List
                            E   ->  set(int index, E element)
                                        => IndexOutOfBoundsException

    Conclution:-  set() will replace the value of the particular index with the value we have passed
                    outside index it will generates Exception: IOOBE
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(13);
        x.add(14);
        x.add(15);

        System.out.println(x);

        System.out.println(x.set(2, 22));
        // System.out.println(x.set(4, 22));       // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4

        System.out.println(x);
    }
}