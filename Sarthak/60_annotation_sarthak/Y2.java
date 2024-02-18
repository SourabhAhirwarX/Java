import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})
@interface XYZ {

}

@XYZ
class T {
    @XYZ
    T() {

    }

    @XYZ
    void pro() {

    }

    @XYZ
    int y;

    public static void main(String[] args) {
        System.out.println("Kaise Ho");
    }
}