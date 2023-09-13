package task4;

public class Square {
    int width;


    public Square(int width) {
        this.width = width;

    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int area() {
        return width * width;
    }
}