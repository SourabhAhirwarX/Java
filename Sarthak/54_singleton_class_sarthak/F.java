import java.io.*;

class Y implements Serializable {
    private static Y y;

    private Y() {

    }

    public static Y getInstance() {
        if(y == null) {
            y = new Y();
        }

        return y;
    }
}

class A {
    public static void main(String[] args) throws Exception {
        Y y = Y.getInstance();
        Y z;

        new ObjectOutputStream(new FileOutputStream(new File("golu.txt"))).writeObject(y);
        z = (Y)(new ObjectInputStream(new FileInputStream(new File("golu.txt")))).readObject();
    
        System.out.println(y);
        System.out.println(z);
    }
}