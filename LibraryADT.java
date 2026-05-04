interface LibraryADT {
    
    /**
     * Adds a new book to the library catalogue.
     * @param isbn The unique integer ID of the book.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    void addBook(int isbn, String title, String author);
    
    /**
     * Borrows a book, removing it from the catalogue (if handled internally) 
     * and adding it to the borrowing history stack.
     * @param isbn The unique integer ID of the book to borrow.
     */
    void borrowBook(int isbn);
    
    /**
     * Searches for a book in the catalogue by its ISBN.
     * @param isbn The unique integer ID of the book.
     */
    void searchBook(int isbn);

    /**
     * Displays the most recently borrowed books in LIFO (Last-In, First-Out) order.
     */
    void viewLatestHistory();
}