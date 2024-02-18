import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is my best friend and mohan is a good singer");

        // m.find();
        m.lookingAt();
        System.out.println(m.group() + " start index: "+ m.start() + " end index: " + m.end());

        // m.find();
        m.lookingAt();
        System.out.println(m.group() + " start index: "+ m.start() + " end index: " + m.end());        
    }
}