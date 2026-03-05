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

        // Action: add book to the library
        library.addBook(book);

        // Assertion: verify the library now contains one book
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

        // Assertion
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

        // Assertion
        assertTrue(returned);
        assertFalse(book.isBorrowed());
    }

    @Test
    void testRemoveBook() {

        LibraryService library = new LibraryService();

        Book book = new Book(1,"Clean Code","Robert Martin");

        library.addBook(book);

        library.removeBook(1);

        assertNull(library.findBookById(1));
    }
     


}