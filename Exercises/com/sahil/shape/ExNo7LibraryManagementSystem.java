import java.util.Scanner;
import java.util.ArrayList;

class Book{
    public String name, Author;
    public Book(String name, String Author){
        this.name = name;
        this.Author = Author;
    }

    @Override 
    public String toString(){
        return "Book{" + 
        "name= "+name+'\'' +
        ", author= "+ Author + '\'' +
        "}";
    }
} 

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBooks(Book book){
        System.out.println(book+": This book has been added to the Library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_To){
        System.out.println(book+": This book has been issued from the library to "+issued_To);
        this.books.remove(book);
    }

    public void returnBook(Book b){
        System.out.println(b+" : This book has been returned");
        this.books.add(b);
    }
}
public class ExNo7LibraryManagementSystem{
    public static void main(String[] args) {
        /*
        Create a library management system which is capable of issuing books to the students book should have info like:
        1. Book name
        2. Book Author 
        3. Issued to 
        4. Issued on
        User should be able to add books, return issued books, issue books 
        Assue that all the users are registered with their names in the central database
        */
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithm","Sahil");
        bk.add(b1);
        Book b2 = new Book("Data Structures","Sabiya");
        bk.add(b2);
        Book b3 = new Book("C++","Abbas");
        bk.add(b3);

        Library lb = new Library(bk);

        lb.addBooks(new Book("java","Rijwana"));
        System.out.println(lb.books);

        lb.issueBook(b1,"Harry");
        System.out.println(lb.books);

    }
}