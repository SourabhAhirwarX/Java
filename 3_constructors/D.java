class Z {
    public static void main(String[] args) {
        Z a = new Z();
        // using new keyword we called the constructor of class Z
        // an object of the class will be created in heap area
        // reference code of such newly created object will be assigned to the variable a which is stored in stack area

        // a is a class type variable, because Z is a class defined by user
        // a is a reference variable, A class type variable holds the reference code of an object of it's own class
        // a is a local level variable, Variable declared inside a method(code block)
   }
}