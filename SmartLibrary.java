import java.util.InputMismatchException;
import java.util.Scanner;

class SmartLibrary implements LibraryADT {
    private BookBST catalogue = new BookBST();
    private BorrowStack history = new BorrowStack();
    private Scanner sc = new Scanner(System.in);

    public void addBook(int isbn, String title, String author) {
        catalogue.insert(isbn, title, author);
        System.out.println("✅ Book added: \"" + title + "\" by " + author + " (ISBN: " + isbn + ")");
    }

    public void searchBook(int isbn) {
        Book b = catalogue.search(isbn);
        if (b != null) {
            System.out.println("🔎 Found: [ISBN: " + b.isbn + "] \"" + b.title + "\" by " + b.author);
        } else {
            System.out.println("❌ Not Found. No book with ISBN " + isbn + " in catalogue.");
        }
    }

    public void borrowBook(int isbn) {
        Book b = catalogue.search(isbn);
        if (b != null) {
            history.push(b);
        } else {
            System.out.println("❌ Book not in catalogue. Cannot borrow ISBN " + isbn + ".");
        }
    }

    public void viewLatestHistory() {
        history.show();
    }

    public void runMenu() {
        System.out.println("=========================================");
        System.out.println("   📚 Welcome to the Smart Library");
        System.out.println("=========================================");

        while (true) {
            printMenu();
            System.out.print("Choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("⚠️  Invalid input. Please enter a number between 1 and 5.");
                sc.nextLine();
                continue;
            }

            if (choice == 5) {
                System.out.println("👋 Exiting Smart Library. Goodbye!");
                break;
            }

            handleChoice(choice);
        }

        sc.close();
    }

    private void printMenu() {
        System.out.println("\n--- SmartLibrary Menu ---");
        System.out.println("1. Add Book");
        System.out.println("2. Search Book");
        System.out.println("3. Borrow Book");
        System.out.println("4. View History");
        System.out.println("5. Exit");
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1: {
                int isbn = readIsbn("Enter ISBN: ");
                if (isbn == -1) return;
                System.out.print("Enter Title: ");
                String title = sc.nextLine().trim();
                System.out.print("Enter Author: ");
                String author = sc.nextLine().trim();
                if (title.isEmpty() || author.isEmpty()) {
                    System.out.println("⚠️  Title and author cannot be empty.");
                    return;
                }
                addBook(isbn, title, author);
                break;
            }
            case 2: {
                int isbn = readIsbn("Enter ISBN to search: ");
                if (isbn == -1) return;
                searchBook(isbn);
                break;
            }
            case 3: {
                int isbn = readIsbn("Enter ISBN to borrow: ");
                if (isbn == -1) return;
                borrowBook(isbn);
                break;
            }
            case 4:
                viewLatestHistory();
                break;
            default:
                System.out.println("⚠️  Invalid option. Please choose 1-5.");
        }
    }

    private int readIsbn(String prompt) {
        System.out.print(prompt);
        try {
            int isbn = sc.nextInt();
            sc.nextLine();
            return isbn;
        } catch (InputMismatchException e) {
            System.out.println("⚠️  Invalid ISBN. Must be an integer.");
            sc.nextLine();
            return -1;
        }
    }
}
