class A {
    public static void main(String[] args) {
        String x = new String("om");      // only one object will be created in the non-pool memory and an object created in the pool memory
        String y = "om";                           // object doesn't created because it found an object already exists in the pool so, it just (reuse) stores the ref. code of previous object
        
        String z = "mohan";                        // another new object will be created in the pool, because it doesn't found it.

        System.out.println(x);
        System.out.println(y);

        System.out.println(z);
    }
}