 package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[20];
        books[0] = new Book(1, "978-001", "The Hobbit", false, ""),
                books[1] = new Book(2, "978-002", "Java for Beginners", false, ""),
                books[2] = new Book(3, "978-003", "The Secret Garden", false, ""),
                books[3] = new Book(4, "978-004", "Harry Potter", true, "Mielat"),
                books[4] = new Book(5, "978-005", "Charlotte's Web", true, "Mekseb"),
                books[5] = new Book(6, "978-006", "Matilda", false, ""),
                books[6] = new Book(7, "978-007", "The Lion, the Witch and the Wardrobe", false, ""),
                books[7] = new Book(8, "978-008", "Alice in Wonderland", true, "Sara"),
                books[8] = new Book(9, "978-009", "Wonder", false, ""),
                books[9] = new Book(10, "978-010", "The Little Prince", false, ""),
                books[10] = new Book(11, "978-011", "Diary of a Wimpy Kid", true, "David"),
                books[11] = new Book(12, "978-012", "The Giver", false, ""),
                books[12] = new Book(13, "978-013", "Anne of Green Gables", false, ""),
                books[13] = new Book(14, "978-014", "Treasure Island", true, "John"),
                books[14] = new Book(15, "978-015", "Little Women", false, ""),
                books[15] = new Book(16, "978-016", "The Cat in the Hat", false, ""),
                books[16] = new Book(17, "978-017", "Green Eggs and Ham", false, ""),
                books[17] = new Book(18, "978-018", "Charlie and the Chocolate Factory", true, "Mary"),
                books[18] = new Book(19, "978-019", "The Adventures of Tom Sawyer", false, ""),
                books[19] = new Book(20, "978-020", "A Christmas Carol", false, ""),
    }

    ;
    boolean running = true;

        while(running)

    {
        System.out.println("\n===== NEIGHBORHOOD LIBRARY =====");
        System.out.println("1 - Show Available Books");
        System.out.println("2 - Show Checked Out Books");
        System.out.println("3 - Exit");
        System.out.print("Choose an option: ");

        String choice = Scanner.NextLine();

        switch (choice) {
            case "1":
                showAvailableBooks();
                break;

            case "2":
                showCheckedOutBooks();
                break;

            case "3":
                running = false;
                System.out.println("Thank you for visiting the library!");
                break;

            default:
                System.out.println("that is not option. Please try again.");
        }
    }

        Scanner.closed();
}

// Display books that are available
public static void showAvailableBooks() {

    System.out.println("\n===== AVAILABLE BOOKS =====");

    boolean found = false;

    for (Book book :) {
        if (!book. isCheckedOut()) {
            System.out.println(
                    "ID: " + book.getId()
                            + " | ISBN: " + book.getIsbn()
                            + " | Title: " + book.getTitle()
            );
            found = true;
        }
    }

    if (!found) {
        System.out.println("No books are currently available.");
        return;
    }

    System.out.println("Enter a book ID to check it out.");
    System.out.println("X - Return to the home screen");
    System.out.print("Your choice: ");

    String choice = Scanner. nextLine();

    if (choice.equalsIgnoreCase("X")) {
        return;
    }

    try {
        int id = Integer.parseInt(choice);
        Book selectedBook = findBookById(id);

        if (selectedBook == null) {
            System.out.println("Book ID not found.");
        } else if (selectedBook.isCheckedOut()) {
            System.out.println("This book is already checked out.");
        } else {
            System.out.print("Enter your name: ");
            String name = Scanner.NextLine();

            if (name.trim().isEmpty()) {
                System.out.println("Name cannot be empty.");
                return;
            }

            selectedBook.checkOut(name);
            System.out.println("Book checked out successfully!");
        }

    } catch (NumberFormatException e) {
        System.out.println("Please enter a valid book ID or X.");
    }
}

// Display books that are checked out
public static void showCheckedOutBooks() {

    System.out.println("\n===== CHECKED OUT BOOKS =====");

    boolean found = false;

    for (Book book : books) {
        if (book.isCheckedOut()) {
            System.out.println(
                    "ID: " + book.getId()
                            + " | ISBN: " + book.getIsbn()
                            + " | Title: " + book.getTitle()
                            + " | Checked out to: " + book.getCheckedOutTo()
            );
            found = true;
        }
    }

    if (!found) {
        System.out.println("No books are currently checked out.");
        return;
    }

    System.out.println("\nC - Check in a book");
    System.out.println("X - Return to the home screen");
    System.out.print("Your choice: ");

    String choice = Scanner.nextline();

    if (choice.equalsIgnoreCase("C")) {
        checkInBook();
    } else if (!choice.equalsIgnoreCase("X")) {
        System.out.println("Invalid option.");
    }
}

// Check in a book using its ID
public static void checkInBook() {

    System.out.print("Enter the ID of the book to check in: ");

    String choice = Scanner.nextLine();

    try {
        int id = Integer.parseInt(choice);
        Book selectedBook = findBookById(id);

        if (selectedBook =null) {
            System.out.println("Book ID not found.");
        } else if (!selectedBook.isCheckedOut()) {
            System.out.println("This book is not checked out.");
        } else {
            selectedBook.checkIn();
            System.out.println("Book checked in successfully!");
        }

    } catch (NumberFormatException e) {
        System.out.println("Please enter a valid book ID.");
    }
}

// Find a book by its ID
public static Book findBookById(int id) {

    for (Book book : books) {
        if (book.getId() == id) {
            return book;
        }
    }

    return null;
}









