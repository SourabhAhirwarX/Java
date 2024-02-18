class Y implements Cloneable {
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class X extends Y {
    //step-2: create a public static reference variable of class X 
    // and assign an X object;
    private static X obj;
    
    // step-1: declare all of your contructors private
    private X() {

    }

    public static X getInstance() {
        if(obj==null) {
            obj = new X();
        }        

        return obj;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

class A {
    public static void main(String[] args) throws CloneNotSupportedException {
        X x1 = X.getInstance();
        X x2 = (X)x1.clone();

        System.out.println(x1);
        System.out.println(x2);
    }
}