import java.util.Stack;

public class BorrowStack {
    // Stack to store borrowed books (LIFO)
    private Stack<Book> historyStack;
    
    // Constructor
    public BorrowStack() {
        historyStack = new Stack<>();
    }
    
    //Push a borrowed book onto the stack
    public void push(Book book) {
        if (book != null) {
            historyStack.push(book);
            System.out.println("✅ Book borrowed successfully: " + book.title);
        } else {
            System.out.println("❌ Error: Cannot borrow a null book.");
        }
    }
    

    //Display all borrowed books in LIFO order (most recent first)
    public void show() {
        if (historyStack.isEmpty()) {
            System.out.println("📚 History is empty. No books have been borrowed yet.");
            return;
        }
        
        System.out.println("\n📖 BORROWING HISTORY (Most Recent First):");
        System.out.println("========================================");
        
        // Display from top of stack (most recent) to bottom
        for (int i = historyStack.size() - 1; i >= 0; i--) {
            Book book = historyStack.get(i);
            System.out.println((historyStack.size() - i) + ". [ISBN: " + book.isbn + "] → \"" + book.title + "\" by " + book.author);
        }
        
        System.out.println("========================================\n");
    }
    
    //Check if stack is empty
    public boolean isEmpty() {
        return historyStack.isEmpty();
    }
    
    //Get the most recent borrowed book without removing it
    public Book peek() {
        if (historyStack.isEmpty()) {
            return null;
        }
        return historyStack.peek();
    }
    
    //Get the total number of books borrowed
    public int size() {
        return historyStack.size();
    }
}