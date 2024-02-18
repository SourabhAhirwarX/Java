// for creating folder

import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("ChhotaBheem");

        System.out.println(file.mkdir());
    }
}