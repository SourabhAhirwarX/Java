class A {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");

        StringBuffer str2 = str1.append("Ji");

        System.out.println(str1);   
        System.out.println(str2);
    }
}

// StringBuffer/StringBuilder are mutable i.e any operation we perform will be happened on the same object