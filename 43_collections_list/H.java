/*
    here, by using isEmpty() method we can get the boolean value whether the list is empty or contains any element...
                boolean  ->  isEmpty()
    
    isEmpty() method is always called on the object of which we want the state...

    Conclution:- isEmpty() non-parameterized method used to check whether the list is empty or conains any element.
*/

import java.util.ArrayList;
 
class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x.isEmpty());

        x.add(new String("mohan"));
        x.add(new String("rohan")); 
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        System.out.println(x.isEmpty());
    }
}