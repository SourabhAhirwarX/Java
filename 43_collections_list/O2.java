/*
    Problem:    iterate over the list using inhanced for loop...
    =======             implementing using type safety


    here, we are creating the object of interface ArrayList and providing Type safety <String>,
    and then, adding new String objects
                    Object  ->  get(int index)
    since, get message is the part of List interface int parameterized which will return the Object at the parameter index passed...
    and outside the limit will generates Exception : IOOBE

    using inhanced for loop we can also iterate all the elements of the list 
    But, here we have to store the values in reference variable of String class
                i.e. for(String tmp : x)  

    Conclution:- using enhanced for loop(for each loop) we can read all the elements of the list... and make it Type Safe <String>
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        // created a type safe class
        ArrayList<String> x = new ArrayList<String>();

        x.add(new String("mohan"));
        x.add(new String("rohan"));
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        System.out.println(x);

        for(String tmp : x) {                
            System.out.println(tmp);   
        }

        System.out.println(x);
    }
}