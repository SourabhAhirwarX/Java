import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("([0-9])+");

        Matcher m = p.matcher(args[0]);

        if(!m.matches()) {
            System.out.println("Input value is not appropriate...");
        } else {
            int x = Integer.parseInt(args[0]);

            int[] arr = {45, 23, 89};

            System.out.println(arr[x]);

            int y = 12/x;

            System.out.println(y);
        }
    }
}