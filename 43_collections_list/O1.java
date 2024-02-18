/*
    Problem:  iterate over the list using inhanced for loop...
    =======

    here, we are creating the object of interface ArrayList,
    and then, adding new String objects
                    Object  ->  get(int index)
    since, get message is the part of List interface int parameterized which will return the Object at the parameter index passed...
    and outside the limit will generates Exception : IOOBE

    using inhanced for loop we can also iterate all the elements of the list 
    But, here we have to store the values in reference variable of Object class
                i.e. for(Object tmp : x)  

    Conclution:- using enhanced for loop we can read all the elements of the list...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new String("mohan"));
        x.add(new String("rohan"));
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        System.out.println(x);

        for(Object tmp : x) {                
            System.out.println(tmp);        
        }

        System.out.println(x);
    }
}