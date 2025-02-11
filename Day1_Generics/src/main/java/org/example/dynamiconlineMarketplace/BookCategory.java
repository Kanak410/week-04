package org.example.dynamiconlineMarketplace;
class Book extends Product<BookCategory> {
    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }
}

public class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}
