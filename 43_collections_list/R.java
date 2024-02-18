/*
    here, we are using the add() method for inserting new element in the list
        Cases:  1. x.add(2,22);  =>  it will inserted at 2 position and the value at this place will shifts 
                2. x.add(4,22);  =>  it will inserted at the last index i.e. 4 the last index
                3. x.add(5,22);  =>  it will generates Exception: IOOBE because, there will be a blank gap between the list indexes

                                interface List
                            void   ->  add(int index, E element)
                                        => IndexOutOfBoundsException

    Conclution:-  continuation insertion is allowded, but interval insertion not alloweded...
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

        x.add(2,22);
        x.add(4,22);
        // x.add(5,22);        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5, Size: 4

        System.out.println(x);
    }
}