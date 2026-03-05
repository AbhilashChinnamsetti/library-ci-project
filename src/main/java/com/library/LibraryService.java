package com.library;

import java.util.ArrayList;
import java.util.List;

/*
 * LibraryService contains the main business logic
 * for managing books in the library.
 */
public class LibraryService {

    // List that stores all books
    private List<Book> books = new ArrayList<>();


    /*
     * Adds a new book to the library
     */
    public void addBook(Book book) {
        books.add(book);
    }


    /*
     * Borrow a book by ID
     */
    public boolean borrowBook(int id) {

        for (Book book : books) {

            if (book.getId() == id && !book.isBorrowed()) {
                book.borrowBook();
                return true;
            }
        }

        return false;
    }


    /*
     * Return a borrowed book
     */
    public boolean returnBook(int id) {

        for (Book book : books) {

            if (book.getId() == id && book.isBorrowed()) {
                book.returnBook();
                return true;
            }
        }

        return false;
    }


    /*
     * Remove a book from the library
     */
    public void removeBook(int id) {

        books.removeIf(book -> book.getId() == id);

    }


    /*
     * Find a book by ID
     */
    public Book findBookById(int id) {

        for (Book book : books) {

            if (book.getId() == id) {
                return book;
            }
        }

        return null;
    }


    /*
     * Return all books in the library
     */
    public List<Book> getBooks() {
        return books;
    }
}