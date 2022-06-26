
package librarysystem;

import java.util.*;

public class Catalogue {
    private static int currentUnusedBookNo;
    private int maxBooks;
    private int numBooks;
    // composition relationship, catalogue has-a book 
    Book[] bookList = new Book[5];
    
    public Catalogue(int bookNoSeed, int maxBooks) {
        this.numBooks = bookNoSeed;
        this.maxBooks = maxBooks;
    }
    public boolean addBook(String title,String mainAuthor,String genre,int year)
    {
        Book book = null;
        book = new Book(numBooks,title,mainAuthor,genre,year);
        if(book == null )return false;
       
        else
        {
            bookList[numBooks] = book;
            this.numBooks++;
            return true;
        }
    }   
    public String viewBook(int bNum){
        String s = "";
       for(int i =0; i<numBooks; i++){
           Book book = bookList[i];
            s = book.toString(); 
       }
       return s;
    }
    public boolean deleteBook(int bNum){
         for(int i = 0;i < numBooks; i++)
        {
            int no = bookList[i].getBookNumber();
            if(bNum == no)
            {
                for(int j = i;j < (5-i );j++)
                {
                    Book temp = bookList[j];
                    bookList[j] = bookList[j+1];
                    temp = null;
                    bookList[j+1] = temp;
                }
                numBooks--;
                return true;
            }
        }
        System.out.println("Book not Found to delete");
        return false;
    }
    private int findBook(int bNum){
        for (int i=0; i<numBooks; i++){
            Book book = bookList[i];
            int no = book.getBookNumber();
            System.out.println(no);
            if(bNum == no)
            {
                return 1;
            }
            System.out.println("Failed locating book");
        }
          return 0;
    }
    public String getBookList()
    {
        for(int i = 0;i < numBooks; i++)
        {
            System.out.println("==============================================");
            Book book = bookList[i];
            String Title = book.toString();
            System.out.println(Title);
        }
        return "";
    }
}