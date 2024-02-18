class A {
    static { 
        System.out.println(y);  //error: illegal forward reference
    }

    static int y = 9;
}