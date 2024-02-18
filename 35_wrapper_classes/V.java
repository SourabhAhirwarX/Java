class A {
    public static void main(String[] args) {
        int a = 2;
        
        //Case 1:
        // Byte x = 2;
        // Short y = 20;
        // Character z = 340;
        
        //Case 2:
        // Byte x = a;       // error: incompatible types: int cannot be converted to Byte
        // Byte x = (byte)a;       // error: incompatible types: int cannot be converted to Byte
        // Short y = a;      // error: incompatible types: int cannot be converted to Short
        // Character z = a;  // error: incompatible types: int cannot be converted to Character

        //Case 3:
        // Byte x = 127;           // error: incompatible types: int cannot be converted to Byte
        // Short y = 32768;        // error: incompatible types: int cannot be converted to Byte
        // Character z = 65536;    // error: incompatible types: int cannot be converted to Byte
    }
}