import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".*xx");

        Matcher m = p.matcher("1dew_xx8iUyRxx0p29q");

        while(m.find()) {
            System.out.println(m.group() + " start index: "+ m.start() + " end index: " + m.end());
        }
    }
}