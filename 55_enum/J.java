class Z {
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}

class A {
    public static void main(String[] args) {
        Z.Days y = Z.Days.FRIDAY;

        Days days;  // error: cannot find symbol
    }
}