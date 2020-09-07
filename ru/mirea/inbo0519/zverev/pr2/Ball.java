package ru.mirea.inbo0519.zverev.pr2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    private double xSpeed = 0;
    private double ySpeed = 0;

    public Ball() {
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setXYSpeed(double xDisp, double yDisp){
        xSpeed = xDisp;
        ySpeed = yDisp;
    }

    public void move(){
        x+=xSpeed;
        y+=ySpeed;
    }

    @Override
    public String toString() {
        return "Ball@(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
