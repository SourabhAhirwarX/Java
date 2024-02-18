class A {
    public static void main(String[] args) {
        int x = (int)2.3f;
        
        //int<--float ---- type mismatched thus conversion required
        //convertible? --> yes
        //widenning/narrowing conversion?---> narrowing
        //int(-2147483648 to 2147483647) vs. float(3.4e−038 to 3.4e+038)
        //Auto/Forced conversion? ---> forced(because narrowing conversion and there is risk associated...)
        //forced conversion must be done by the developer ....
        //how? using type-cast (<type>) oerator...
        
        System.out.println(x);
    }
}