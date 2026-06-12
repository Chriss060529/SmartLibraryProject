# 🏫 Group Members

1. Choi Jin Seng 24063469
2. Lee Ke Yin 22112636
3. Lim Kai Hern 23116000
4. Chriss Fun Kai Qing 23117185

---

# 📚 Smart Library System

A Java console-based library system that demonstrates the use of **Binary Search Trees (BST)** and **Stack** data structures.

> WIA1002 Data Structures — Group Project

---

## 🎯 Project Objective

To understand how different data structures serve different access patterns:

* **BST** → Fast searching by ISBN (O(log n))
* **Stack** → LIFO access for borrowing history (most recent first)

---

## ⚙️ Features

* Add books (ISBN, Title, Author) — supports multi-word titles/authors
* Search books by ISBN using recursive BST traversal
* Borrow books (pushed onto history stack)
* View full borrowing history in LIFO order
* Menu-driven console interface
* Robust input validation (non-integer ISBNs handled gracefully)

---

## 🧠 Data Structures Used

* **Binary Search Tree (BST)** → Book storage & search (`BookBST.java`)
* **Stack** → Borrowing history, LIFO (`BorrowStack.java`)

---

## 🏗️ Project Structure

```
SmartLibraryProject/
├── LibraryADT.java     # Interface — defines the contract
├── Book.java           # BST node (isbn, title, author, left, right)
├── BookBST.java        # Binary Search Tree (recursive insert + search)
├── BorrowStack.java    # Stack<Book> wrapper (push + LIFO show)
├── SmartLibrary.java   # Integration: implements LibraryADT + menu
├── Main.java           # Entry point
└── README.md
```

---

## 👥 Team Roles

| Role | Files | Responsibility |
|---|---|---|
| 👤 BST + Search | `Book.java`, `BookBST.java` | Recursive insert and search by ISBN |
| 👤 Stack (History) | `BorrowStack.java` | Track borrowed books, LIFO display |
| 👤 ADT Design | `LibraryADT.java` | Interface for information hiding |
| 👤 Admin + UI | `SmartLibrary.java`, `Main.java` | Menu loop, integration, input validation |

---

## 🖥️ Menu Options

```
--- SmartLibrary Menu ---
1. Add Book
2. Search Book
3. Borrow Book
4. View History
5. Exit
```

---

## ▶️ How to Run

From the project root:

```bash
# Compile all Java files
javac *.java

# Run the program
java Main
```

---

## 🧪 Example Session

```
Choice: 1
Enter ISBN: 101
Enter Title: Harry Potter
Enter Author: J.K. Rowling
✅ Book added: "Harry Potter" by J.K. Rowling (ISBN: 101)

Choice: 2
Enter ISBN to search: 101
🔎 Found: [ISBN: 101] "Harry Potter" by J.K. Rowling

Choice: 3
Enter ISBN to borrow: 101
✅ Book borrowed successfully: Harry Potter

Choice: 4
📖 BORROWING HISTORY (Most Recent First):
========================================
1. [ISBN: 101] → "Harry Potter" by J.K. Rowling
========================================
```

---

## 📌 Implementation Notes

* BST search and insert use recursion
* Stack follows strict LIFO — most recent borrow is shown first
* Non-integer input is caught with `InputMismatchException` and never crashes the program
* Title and author are read with `nextLine()` to support multi-word inputs
* `SmartLibrary` implements `LibraryADT`; all internal data structures are `private`

---

## 💡 Learning Outcomes

* Understanding Abstract Data Types (ADT) and information hiding
* Implementing real-world recursive data structures
* Choosing the right structure for the right access pattern
* Building modular, testable Java applications
