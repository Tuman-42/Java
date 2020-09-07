package ru.mirea.inbo0519.zverev.pr1;

public class Book {
    private String Name = "Book";
    private int Page = 0;

    public Book() {
    }

    public Book(String name) {
        Name = name;
    }

    public Book(String name, int page) {
        Name = name;
        Page = page;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Page=" + Page +
                '}';
    }

    public void ReadTime(){
        System.out.println("You'll read "+this.Name+" about "+Math.round(this.Page*1.5)+" min.");
    }
}
