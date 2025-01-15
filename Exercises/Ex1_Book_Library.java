import java.util.Scanner;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The " + book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist!");
    }

    public void returnBook(String book) {
        addBook(book);
    }
}

public class Ex1_Book_Library {
    public static void main(String[] args) {
        // you have to implement a library using java class library
        // Methids : addBook. issueBook, returnBook, showAvailableBooks
        // properties : Array to store the available books ,
        //              Array to store the issued books.

        int ch;
        Library centralLibrary = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("+++++ Central Library +++++\n");
        System.out.println("*** Main Menu ***");

        do {
            System.out.print("\n1. Add Book\n2. Issue Book\n3. Show Available Books\n4. Return Book\n5. Close\n");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            sc.nextLine();  // Consume the newline character left by nextInt()

            switch (ch) {
                case 1:
                    System.out.print("Enter book name: ");
                    String Ab = sc.nextLine();
                    centralLibrary.addBook(Ab);
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    String Ib = sc.nextLine();
                    centralLibrary.issueBook(Ib);
                    break;

                case 3:
                    centralLibrary.showAvailableBooks();
                    break;

                case 4:
                    System.out.print("Enter book name: ");
                    String Rb = sc.nextLine();
                    centralLibrary.returnBook(Rb);
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        } while (ch != 5);
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter book name:: ");
        // String Ab = sc.nextLine();
        // centralLibrary.addBook(Ab);
        // centralLibrary.addBook("Rich Dad and Poor Dad");
        // centralLibrary.addBook("C++");
        // centralLibrary.addBook("Java");
        // centralLibrary.showAvailableBooks();
        // centralLibrary.issueBook("C++");
        // centralLibrary.showAvailableBooks();
        // centralLibrary.returnBook("C++");
        // centralLibrary.showAvailableBooks();

        sc.close();
    }
}
