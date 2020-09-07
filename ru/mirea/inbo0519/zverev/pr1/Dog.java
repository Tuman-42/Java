package ru.mirea.inbo0519.zverev.pr1;
import java.lang.*;

public class Dog {
    private String Name = "Pup";
    private int Age = 0;

    public Dog(String name) {
        Name = name;
    }

    public Dog(String name, int age) {
        Name = name;
        this.Age = age;
    }

    public Dog() {
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name=" + Name +
                ", Age=" + Age +
                '}';
    }

    public void intoHumanAge(){
        System.out.println(Name+"'s age in human years is "+Age*7+" years");
    }
}
