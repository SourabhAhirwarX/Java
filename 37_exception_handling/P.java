class A {
    public static void main(String[] args) {
        try {
            try {

            } catch(NumberFormatException e) {

            } finally {

            }
        } catch(NumberFormatException e) {
            try {

            } catch(NumberFormatException t) {

            } finally {

            }
        } finally {
            try {

            } catch(NumberFormatException t) {

            } finally {

            }
        }
    } 
}