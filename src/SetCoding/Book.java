package SetCoding;

import java.util.LinkedHashSet;

public class Book
{
    int id;

    String authorName, nameOfBook, publisher;

    int quantity;

    public Book(int id, String authorName, String nameOfBook, String publisher, int quantity)
    {
        this.id = id;
        this.authorName = authorName;
        this.nameOfBook = nameOfBook;
        this.publisher = publisher;
        this.quantity = quantity;
    }


    public static void main(String[] args)
    {
        LinkedHashSet<Book> hashSet = new LinkedHashSet<Book>();

        Book book1 = new Book(121, "Abdul","Sherlock Holmes","abc publisher",25);
        Book book2 = new Book(452, "Qasim","Programming","xyz Publishers",75);
        Book book3 = new Book(175, "Ali","Java","ijk Publishers",98);

        //adding the books into hashtable
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);

        for (Book books : hashSet)
        {
            System.out.println(books.id + " " + books.nameOfBook + " " + books.authorName + " " + books.publisher + " " + books.quantity);
        }



    }

}
