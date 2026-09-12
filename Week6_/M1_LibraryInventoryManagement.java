class BookInventory {
    String title, author;
    int copiesAvailable;

    BookInventory(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        copiesAvailable = copies;
    }

    void printEntry() {
        System.out.println(title + " by " + author +
                " - " + copiesAvailable + " copies available");
    }
}

class Main {
    public static void main(String[] args) {
        BookInventory[] books = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory b : books)
            b.printEntry();
    }
}