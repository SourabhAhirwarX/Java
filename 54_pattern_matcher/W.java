import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a.b");

        Matcher m = p.matcher("xa b_ 2ra#b89a9b_#4@aZb");

        while(m.find()) {
            System.out.println(m.group() + " start index: "+ m.start() + " end index: " + m.end());
        }
    }
}