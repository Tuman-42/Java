package ru.mirea.inbo0519.zverev.pr1;

public class Ball {
    private double radius = 0.22;
    private String Color = "WHITE";

    public Ball() {
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public Ball(double radius, String color) {
        this.radius = radius;
        Color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", Color='" + Color + '\'' +
                '}';
    }

}
