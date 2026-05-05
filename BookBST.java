class BookBST {
    private Book root;

    public void insert(int isbn, String title, String author) {
        root = insertRec(root, isbn, title, author);
    }

    private Book insertRec(Book current, int isbn, String title, String author) {
        if (current == null) {
            return new Book(isbn, title, author);
        }

        if (isbn < current.isbn) {
            current.left = insertRec(current.left, isbn, title, author);
        } else if (isbn > current.isbn) {
            current.right = insertRec(current.right, isbn, title, author);
        }

        return current;
    }

    public Book search(int isbn) {
        return searchRec(root, isbn);
    }

    private Book searchRec(Book current, int isbn) {
        if (current == null || current.isbn == isbn) {
            return current;
        }

        if (isbn < current.isbn) {
            return searchRec(current.left, isbn);
        } else {
            return searchRec(current.right, isbn);
        }
    }
}