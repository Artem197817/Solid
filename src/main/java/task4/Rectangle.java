package task4;

public class Rectangle extends Square {

    private int height;
    public Rectangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public int area (){
        return height * width;
    }
   
   
   
}
