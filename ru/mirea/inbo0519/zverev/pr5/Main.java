package ru.mirea.inbo0519.zverev.pr5;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static int first()
    {
        int a;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        if (a!=0) {
            if (a%2==1)
                System.out.print(a + " ");
            return first();
        }
        else
            return 0;
    }

    public static int second_1()
    {
        int a;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        if (a!=0) {
            System.out.print(a + " ");
            return second_2();
        }
        else
            return 0;
    }

    public static int second_2()
    {
        int a;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        if (a!=0)
            return second_1();
        else
            return 0;
    }

    public static int third(String buf)
    {
        System.out.print(buf.charAt(0));
        if (buf.length()==1)
            return 0;
        else {
            buf = buf.substring(1);
            return third(buf);
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите номер задания: ");
        int a,n;
        Scanner in = new Scanner(System.in);
        a=in.nextInt();
        switch (a)
        {
            case 1:
                first();
                break;
            case 2:
                second_1();
                break;
            case 3:
                System.out.print("Введите число N: ");
                n=in.nextInt();
                third(String.valueOf(n));
                break;
        }
    }
}