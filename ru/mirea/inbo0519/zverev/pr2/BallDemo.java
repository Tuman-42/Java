package ru.mirea.inbo0519.zverev.pr2;

public class BallDemo {
    public void Demo(){
        Ball b1 = new Ball();
        Ball b2 = new Ball(1.0,1.0);
        b1.setX(8.0);
        b1.setY(5.2);
        b1.setXYSpeed(3.2,4.5);
        b2.setXYSpeed(-1.4,-3.4);
        System.out.println(b1);
        System.out.println(b2);
        b1.move();
        b2.move();
        System.out.println(b1);
        System.out.println(b2);
    }
}
