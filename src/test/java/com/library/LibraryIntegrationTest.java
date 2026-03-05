package com.library;

// Import JUnit testing annotation
import org.junit.jupiter.api.Test;

// Import assertion methods used to verify expected results
import static org.junit.jupiter.api.Assertions.*;

/*
 * LibraryIntegrationTest
 *
 * This class contains an INTEGRATION TEST for the Library Management System.
 *
 * Unlike unit tests that test a single method,
 * integration tests verify that multiple components
 * work together correctly.
 *
 * In this test we validate the complete workflow:
 *
 * 1. Add a book
 * 2. Borrow the book
 * 3. Return the book
 *
 * This simulates a real user interaction with the system.
 */

public class LibraryIntegrationTest {

    /*
     * Integration Test: Borrow and Return Flow
     *
     * This test checks whether the full borrowing lifecycle works correctly.
     *
     * Steps performed:
     * 1. Create LibraryService instance
     * 2. Add a book to the library
     * 3. Borrow the book
     * 4. Return the book
     * 5. Verify both operations succeeded
     */

    @Test
    void testBorrowReturnFlow() {

        // Step 1: Create a new LibraryService instance
        // This represents the library system
        LibraryService library = new LibraryService();

        // Step 2: Create a new Book object
        // Book(id, title, author)
        Book book = new Book(1,"Clean Code","Robert Martin");

        // Step 3: Add the book to the library
        library.addBook(book);

        // Step 4: Attempt to borrow the book using its ID
        boolean borrowed = library.borrowBook(1);

        // Step 5: Attempt to return the same book
        boolean returned = library.returnBook(1);

        // Step 6: Assertions
        // Verify that the borrow operation was successful
        assertTrue(borrowed);

        // Verify that the return operation was successful
        assertTrue(returned);
    }

}