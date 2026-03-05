package com.library;

/*
 * Book class represents a single book in the library.
 * It stores book information and its borrowing status.
 */
public class Book {

    // Unique identifier for the book
    private int id;

    // Book title
    private String title;

    // Author name
    private String author;

    // Indicates if the book is borrowed
    private boolean borrowed;

    /*
     * Constructor
     * Initializes a book with ID, title and author.
     * By default the book is not borrowed.
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    // Borrow the book
    public void borrowBook() {
        borrowed = true;
    }

    // Return the book
    public void returnBook() {
        borrowed = false;
    }
}