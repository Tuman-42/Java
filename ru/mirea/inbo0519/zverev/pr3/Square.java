package ru.mirea.inbo0519.zverev.pr3;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side){
        length = side;
        width = side;
    }

    public Square(double side, String color, boolean filled){
        length = side;
        width = side;
        this.colour = color;
        this.filled = filled;
    }

    public double getSide(){
        return length;
    }

    public void setSide(double side){
        length = side;
        width = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }
}
