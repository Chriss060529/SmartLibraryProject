# 📚 Smart Library System

A Java console-based library system that demonstrates the use of **Binary Search Trees (BST)** and **Stack** data structures.

---

## 🎯 Project Objective

To understand how different data structures handle different access patterns:

* **BST** → Fast searching (O(log n))
* **Stack** → LIFO access for borrowing history

---

## ⚙️ Features

* Add books (ISBN, Title, Author)
* Search books using BST
* Borrow books (stored in stack)
* View borrowing history (latest first)
* Menu-driven console interface

---

## 🧠 Data Structures Used

* **Binary Search Tree (BST)** → Book storage & search
* **Stack** → Borrowing history (LIFO)

---

## 👥 Team Roles

### 👤 BST + Search

* Implement `Book` and `BookBST`
* Handle insert & recursive search

### 👤 Stack (History)

* Implement `BorrowStack`
* Manage borrowing history display

### 👤 ADT Design

* Create `LibraryADT` interface
* Ensure information hiding

### 👤 Admin + UI

* Implement `SmartLibrary`
* Handle menu system & user interaction

---

## 🖥️ Menu Options

1. Add Book
2. Search Book
3. Borrow Book
4. View History
5. Exit

---

## 🏗️ Project Structure
---

## ▶️ How to Run

1. Compile:
   javac *.java

2. Run:
   java Main

---

## 📌 Notes

* Uses recursion for BST search
* Stack follows LIFO principle
* Input validation handled in menu

---

## 💡 Learning Outcome

* Understanding abstract data types (ADT)
* Implementing real-world data structures
* Building modular Java applications
