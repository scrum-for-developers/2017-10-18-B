package de.codecentric.worblehat.acceptancetests.adapter.wrapper;

public class HtmlBook {

    private final String title;
    private final String author;
    private final String edition;
    private final String isbn;
    private final String yearOfPublication;
    private final String borrower;
    private final String description;

    public HtmlBook(String title, String author, String yearOfPublication, String edition, String isbn, String borrower, String description) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.isbn = isbn;
        this.yearOfPublication = yearOfPublication;
        this.borrower = borrower;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDescription() { return description; }
}
