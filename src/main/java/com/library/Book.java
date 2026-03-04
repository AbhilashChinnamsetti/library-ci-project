package com.library;

/*
 * Book class represents a single book in the library system.
 * It stores basic book information and the current borrowing status.
 */
public class Book {

    // Unique identifier for the book
    private int id;

    // Title of the book
    private String title;

    // Author of the book
    private String author;

    // Indicates whether the book is currently borrowed or available
    private boolean borrowed;

    /*
     * Constructor used to create a new Book object.
     * By default, a new book is available (not borrowed).
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    /*
     * Returns true if the book is currently borrowed.
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /*
     * Marks the book as borrowed.
     */
    public void borrowBook() {
        borrowed = true;
    }

    /*
     * Marks the book as returned (available again).
     */
    public void returnBook() {
        borrowed = false;
    }

    /*
     * Getter method for book ID.
     */
    public int getId() {
        return id;
    }

    /*
     * Getter method for book title.
     */
    public String getTitle() {
        return title;
    }

    /*
     * Getter method for book author.
     */
    public String getAuthor() {
        return author;
    }
}