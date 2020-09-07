package ru.mirea.inbo0519.zverev.pr3;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColor() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    abstract double getArea();

    abstract double getPerimeter();

}
