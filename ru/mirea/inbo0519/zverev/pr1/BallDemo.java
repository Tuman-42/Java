package ru.mirea.inbo0519.zverev.pr1;

public class BallDemo {
    public void Demo(){
        Ball b1 = new Ball(0.05, "RED");
        Ball b2 = new Ball(0.22, "BLUE");
        Ball b3 = new Ball(1);
        b3.setColor("BLACK");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

}
