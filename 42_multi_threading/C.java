/*
    here, we created a ThreadGroup named as "ABC".
    then we are getting its maxPriority which will return 10 (i.e. the members of "ABC" can have maxpriority as 10...)
*/

class A {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("ABC");

        System.out.println(tg.getMaxPriority());
    }
}