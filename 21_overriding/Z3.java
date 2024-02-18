import java.io.Console;

interface Jumpable {
    void jump();
}

class SportsCar implements Jumpable { 
    public void jump() {
        System.out.println("SportsCar Jumping");
    }
}

class Ball implements Jumpable { 
    public void jump() {
        System.out.println("Ball Jumping");
    }
}

class X {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Ball /n2 for Sports Car: ");
        Console con = System.console();
        String inp = con.readLine();        
        int input = Integer.parseInt(inp);

        Jumpable jmp = createJumpable(input);
        jmp.jump();
    }

    static Jumpable createJumpable(int inp) {
        Jumpable jmp = null;

        if(inp == 1) {
            jmp = new Ball();
        } else if(inp == 2) {
            jmp = new SportsCar();
        } else {
            System.out.println("Invalid Input");
        }

        return jmp;
    } 
}