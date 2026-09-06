class Book {
    String title;
    String author;
    int pages, price;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Book:" + title);
        System.out.println("Author:" + author);
    }

    public Book(String title, String author, int pages, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        System.out.println("Book:" + title);
        System.out.println("Author:" + author);
        System.out.println("Pages:" + pages);
        System.out.println("Price:" + price);
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class ClassesQ17 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "John Doe");
        Book b2 = new Book("Java", "John Doe", 300, 100);
        b1.display();
        b2.display();
    }
}