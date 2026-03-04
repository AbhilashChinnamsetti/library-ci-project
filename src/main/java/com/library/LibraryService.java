package com.library;

import java.util.ArrayList;
import java.util.List;

/*
 * LibraryService class contains the main business logic
 * for managing books in the library.
 *
 * It supports operations such as:
 *  - Adding books
 *  - Borrowing books
 *  - Returning books
 */
public class LibraryService {

    // Internal list storing all books in the library
    private List<Book> books = new ArrayList<>();


    /*
     * Adds a new book to the library collection.
     *
     * Input:
     *   Book object
     *
     * Result:
     *   Book is stored in the internal list
     */
    public void addBook(Book book) {
        books.add(book);
    }


    /*
     * Allows a user to borrow a book using its ID.
     *
     * Logic:
     * 1. Search the list of books
     * 2. If the book exists and is not borrowed
     * 3. Mark it as borrowed
     *
     * Returns:
     *   true  -> borrow successful
     *   false -> book unavailable
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
     * Allows a user to return a previously borrowed book.
     *
     * Logic:
     * 1. Find the book by ID
     * 2. Verify it is currently borrowed
     * 3. Mark it as returned
     *
     * Returns:
     *   true  -> return successful
     *   false -> return failed
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
 * Finds a book in the library using its ID.
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
     * Returns the list of all books in the library.
     * Used mainly for testing and verification.
     */
    public List<Book> getBooks() {
        return books;
    }
}

