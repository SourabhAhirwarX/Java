import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}");

        Matcher m = p.matcher(args[0]);

        
        if(m.matches())
            System.out.println(m.group() + " start index: "+ m.start() + " end index: " + m.end());        
    }
}

// \\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}