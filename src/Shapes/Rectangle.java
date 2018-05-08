package Shapes;

public class Rectangle {
    protected int length;
    protected int width;
    public Rectangle(){}

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getArea(){
        return length * width;
    }
    public int getPerimeter(){
        return (length *2) + (width * 2);
    }
    public void setWidth() {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    public void setLength() {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
}

