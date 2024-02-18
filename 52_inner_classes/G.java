class A {
    class G {
        int y = 90;
        
        // error: Illegal static declaration in inner class A.G
        static float e = 2.3f;

        // i.e. we can't mark a variable as static in inner class
    }
}