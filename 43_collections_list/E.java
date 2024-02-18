/*
    here, we are Making and object of ArrayList i.e. List
    Then, we creates New String objects and add them into the list...

    and, then making object of String class and passes "sohan" and "ganesh" one by one
    and then calling contains method over reference variable str of String object, were it will return true or false....
                boolean  ->  contains(Object o)
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

        String str = new String("sohan");
        // String str = new String("ganesh");

        System.out.println(x.contains(str));
    }
}