/*
    Q. what single change we will make in the code to remove all the elements from the list ?

    Ans:- inside the normal for loop we can pass the zero into the remove method 
            so, that for for each iteration it will points to next value till the last index...
*/

import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add(new String("mohan"));
        x.add(new String("rohan"));
        x.add(new String("sohan"));
        x.add(new String("tohan"));
        x.add(new String("gohan"));

        System.out.println(x);

        int size = x.size();

        for(int i=0; i<size; i++) {                
            System.out.println(x.remove(i));       
            // System.out.println(x.remove(0));  
            
            // every time it will iterate over the 0th index value...
        }

        System.out.println(x);
    }
}