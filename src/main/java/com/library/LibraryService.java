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
    public Book findBookByTitle(String title) {

        for (Book book : books) {

            if (book.getTitle().equals(title)) {
                return book;
            }

        }

        return null;
    }
    /**
 * Counts the total number of books currently stored in the library.
 *
 * @return total number of books in the library collection
 */
    public int countBooks() {

    // books is the list that stores all Book objects in the library
    // size() returns how many books exist in the list
        return books.size();
    }


    /*
     * Return all books in the library
     */
    public List<Book> getBooks() {
        return books;
    }
}