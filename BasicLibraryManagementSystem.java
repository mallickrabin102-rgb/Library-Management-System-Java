import java.util.Scanner;

class Books {
    String name;
    String author;
    int bookId;

    Books(String name, String author, int bookId) {
        this.name = name;
        this.author = author;
        this.bookId = bookId;
    }

    void display() {
        System.out.println("Book Name:" + name);
        System.out.println("Author Name:" + author);
        System.out.println("Book ID:" + bookId);
    }
}

public class BasicLibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books book[] = new Books[5];
        book[0] = new Books("JAVA", "Jems", 101);
        book[1] = new Books("DSA", "Alex", 110);
        book[2] = new Books("PYTHON", "Paper", 120);
        book[3] = new Books("C++", "Rioit", 130);
        book[4] = new Books("DBMS", "Benduk", 140);

        int choice;
        int searchId;
        boolean found;
        boolean isIssued;
        String isIssuedBook;
        do {
            System.out.println("1.View all books");
            System.out.println("2.Search for a book");
            System.out.println("3 Issue book");
            System.out.println("4.Exit");
            System.out.println("Enter a choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Books books : book) {
                        System.out.println("----------");
                        books.display();
                        System.out.println();
                    }
                    break;
                case 2:
                    found = false;
                    System.out.println("Enter book ID to search a book:");
                    searchId = sc.nextInt();
                    for (Books books : book) {
                        if (books.bookId == searchId) {
                            found = true;
                            System.out.println("Book found");
                            books.display();
                            break;
                        }

                    }
                    if (!found) {
                        System.out.println("Not found!");
                    }
                    break;
                case 3:
                    isIssued = false;
                    System.out.println("Enter book name to issued:");
                    sc.nextLine();
                    isIssuedBook = sc.nextLine();
                    for (Books books : book) {
                        if (books.name.equals(isIssuedBook)) {
                            isIssued = true;
                            System.out.println("You issue " + books.name+" Book");
                            break;
                        }
                    }
                    if (!isIssued) {
                        System.out.println("Book not aviable!!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice:");
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}
