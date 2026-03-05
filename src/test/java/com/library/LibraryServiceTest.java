package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * LibraryServiceTest contains unit tests for the
 * LibraryService class.
 *
 * These tests verify that the core functionality
 * of the library system behaves as expected.
 */
public class LibraryServiceTest {

    /*
     * Test Case:
     * Verify that a book can be successfully added to the library.
     */
    @Test
    void testAddBook() {

        // Setup: create library service and book
        LibraryService library = new LibraryService();
        Book book = new Book(1, "Java Programming", "James Gosling");

        // Action
        library.addBook(book);

        // Assertion
        assertEquals(1, library.getBooks().size());
    }


    /*
     * Test Case:
     * Verify that a book can be borrowed successfully.
     */
    @Test
    void testBorrowBook() {

        // Setup
        LibraryService library = new LibraryService();
        Book book = new Book(1, "Clean Code", "Robert Martin");

        library.addBook(book);

        // Action
        boolean borrowed = library.borrowBook(1);

        // Assertions
        assertTrue(borrowed);
        assertTrue(book.isBorrowed());
    }


    /*
     * Test Case:
     * Verify that a borrowed book can be returned.
     */
    @Test
    void testReturnBook() {

        // Setup
        LibraryService library = new LibraryService();
        Book book = new Book(1, "Design Patterns", "GoF");

        library.addBook(book);
        library.borrowBook(1);

        // Action
        boolean returned = library.returnBook(1);

        // Assertions
        assertTrue(returned);
        assertFalse(book.isBorrowed());
    }


    /*
     * Test Case:
     * Verify that a book can be removed from the library.
     */
    @Test
    void testRemoveBook() {

        // Setup
        LibraryService library = new LibraryService();
        Book book = new Book(1, "Clean Code", "Robert Martin");

        library.addBook(book);

        // Action
        library.removeBook(1);

        // Assertion
        assertNull(library.findBookById(1));
    }
    @Test
    void testFindBookByTitle() {

        LibraryService library = new LibraryService();

        Book book = new Book(1,"Clean Code","Robert Martin");

        library.addBook(book);

        Book result = library.findBookByTitle("Clean Code");

        assertNotNull(result);
    }

    /**
 * Test Case:
 * Verify that the library correctly counts the number of books.
 */
    @Test
    void testCountBooks() {

    // Setup: create a new LibraryService instance.
        LibraryService library = new LibraryService();

    // Add two books to the library
        library.addBook(new Book(1, "Book1", "Author"));
        library.addBook(new Book(2, "Book2", "Author"));

    // Assertion: verify the countBooks() method returns 2.
        assertEquals(2, library.countBooks());
    }

}