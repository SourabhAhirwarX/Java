import java.util.Date;

class A {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        long curTime = date.getTime();

        // date.setTime(curTime + 3600000);  //1hr - 60min - 60x60seconds(3600) - 3600x1000milliseconds(3600000)
        date.setTime(curTime + 3600000*7);  //1hr - 60min - 60x60seconds(3600) - 3600x1000milliseconds(3600000)

        System.out.println(date);
    }
}