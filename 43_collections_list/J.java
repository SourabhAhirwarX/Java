/*
    here, we want to delete the particular element from the list,
        so, we use remove() Object parameterized method of collection interface to remove that particualar element...
                                boolean  ->  remove(Object o)

    which will return true or false according to the condition i.e. whether the element is found or not...

    Conclution:- know which parameterized method to use for removal i.e. 
                collection interface =>   remove(Object o)  ->  boolean     ///
                    List interface   =>   remove(int index) ->  Object  
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(5);
        x.add(3); 
        x.add(7);
        x.add(2);
        x.add(9);

        Integer w = Integer.valueOf(2);     // we are creating object to delete the particular element from the list
        // static Integer -> valueOf​(int i)

        System.out.println(x);
        System.out.println(x.remove(w));     // boolean -> remove(obj)
        System.out.println(x);
    }
}