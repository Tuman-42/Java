package ru.mirea.inbo0519.zverev.pr2;

public class AuthorDemo {
    public void Demo() {
        Author A1 = new Author("Pushkin","Pushkin@yandex.ru",'m');
        Author A2 = new Author("Dontsova","Dontsova@yandex.ru",'f');
        Author A3 = new Author("King","king@gmail.com",'m');
        System.out.println("info about "+A3.getName()+" email is "+A3.getEmail()+"gender: "+A3.getGender());
        System.out.println(A2);
        A2.setEmail("Dontsova@gmail.com");
        System.out.println(A2);
        System.out.println(A1);
    }
}
