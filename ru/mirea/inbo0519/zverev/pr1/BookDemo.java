package ru.mirea.inbo0519.zverev.pr1;

public class BookDemo {
    public void Demo() {
        Book b1 = new Book("Farytiles", 27);
        Book b2 = new Book("Gamlet", 208);
        Book b3 = new Book("War and Piece");
        b3.setPage(1089);
        System.out.println(b1);
        b2.ReadTime();
        b3.ReadTime();
    }
}
