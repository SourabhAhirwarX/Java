// Copy a file and copies its data into another file

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("golu.txt");

        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            PrintWriter pf = new PrintWriter(new FileWriter("mohan.txt"));

            String str = null;
            while((str=bf.readLine()) != null) {
                System.out.println(str + " - ");
                pf.println(str);
            }

            bf.close();
            pf.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}