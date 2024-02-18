/*
    here, we want to delete a particular element from the list for which we uses remove() method
                        boolean  ->  remove(Object o)

    since, if element is present in the list it will return true and remove the element => "sohan"
            but, if the element is not present in the list it will return false and the same list will be printed...

    Conclution:- we are using remove() method of interface collection,
                for which we have to pass the object which will return the boolean value accordingly...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) { 
        ArrayList x = new ArrayList();

        String y = new String("mohan");

        x.add(y);
        x.add(new String("rohan")); 
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        String str = new String("sohan");
        // String str = new String("ganesh");

        System.out.println(x);
        System.out.println(x.remove(str));      // boolean  ->  remove(obj)
        System.out.println(x);
    }
}