import java.io.Serializable;

class Shape implements Serializable {
    int length;
    int width;
    int height;
    
    Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}