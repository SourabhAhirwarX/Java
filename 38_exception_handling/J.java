import java.io.IOException;

class A {
    public static void main(String[] args) {
        try {

        }
        // Case1:
        // catch(ArithmeticException e) {

        // }

        //Case2:
        // catch(IOException e) {          // error: exception IOException is never thrown in body of corresponding try statement

        // }

        //Case3:
        // catch(Exception e) {          

        // }

        //Case4:
        // catch(Throwable e) {          
            
        // }

        //Case5:
        catch(Error e) {          
            
        }

        //Case6:
        catch(Object e) {          // error: incompatible types: Object cannot be converted to Throwable
            
        }
    }
}