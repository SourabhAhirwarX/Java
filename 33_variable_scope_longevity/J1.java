class A {
    { 
        System.out.println(y);  // error: illegal forward reference
    }

    int y = 9;
}