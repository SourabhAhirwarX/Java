class A {
    public static void main(String[] args) {
        int x = 'A';
        //int<--char ---- type mismatched thus conversion required
        //convertible? --> yes
        //widenning/narrowing conversion?---> widenning
        //int(-2147483648 to 2147483647) vs. char(0-65535)
        //Auto/Forced conversion? ---> Auto(because widenning conversion and no risk)

        System.out.println(x);
    }
}