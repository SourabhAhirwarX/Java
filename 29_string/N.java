import java.io.Console;

class A {
    public static void main(String[] args) {
        Console x = System.console();

        System.out.println("First Name: ");
        int firstName = Integer.parseInt(x.readLine());
        // String firstName = x.readLine();
        
        System.out.println("Middle Name: ");
        int middleName = Integer.parseInt(x.readLine());
        // String middleName = x.readLine();
        
        System.out.println("Last Name: ");
        String lastName = x.readLine();

        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println(firstName+middleName+" "+lastName);
    }
}