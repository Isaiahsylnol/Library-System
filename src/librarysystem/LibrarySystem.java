
package librarysystem;

import java.util.*;

 class LibrarySystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int no_books = 0;
        int option;
        boolean flag = true;    
        Catalogue schoolBooks = new Catalogue(0,5);
        while(flag){
            
            System.out.println("Welcome to ABC bookclub");
            System.out.println("Please select an option from below");
            System.out.println("\n1: Add Book\n2: Delete Book\n3: View All Books\n4: View Book Details\n5: Exit\n\n");
            option = input.nextInt();
            switch(option)
             {
               // Add Book
               case 1:
               {
                if(no_books < 5)
                {
                  System.out.print("Enter title: ");
                  String title = input.nextLine();title = input.nextLine();
                  System.out.print("Enter author: ");
                  String mainAuthor = input.nextLine();
                  System.out.print("Enter genre: ");
                  String genre = input.nextLine();
                  System.out.print("Enter year published: ");
                  int year = input.nextInt();
                        
                        boolean book_added;
                        // Book object creation 
                        book_added = schoolBooks.addBook(title, mainAuthor, genre, year);
                        if(book_added == true)
                        {
                            System.out.println("\n*********  Added Book Successfully  *********\n");
                            no_books++;
                        }
                        else
                        {
                            System.out.println("\n*********  Failed Adding Book  *********\n");
                        }
                    }
                    else
                    {
                        System.out.println("Max book capacity reached");
                    }
                    break;
                  }
                // Delete Book
                case 2:
                {
                     if(no_books > 0)
                    {
                        int no;
                        System.out.println("Please enter book number of book to delete");
                        no = input.nextInt();
                        boolean delete = schoolBooks.deleteBook(no); // remove the passed number if true
                        if(delete == true)
                        {
                            System.out.println("*** Book deleted from catalogue ***");
                        }
                        else
                        {
                            System.out.println("Book not in catalogue");
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("Please enter at least one book");
                        break;
                    }
                    }
                // View All Books
                case 3:
                {
                   if (no_books > 0){
                      schoolBooks.getBookList();
                      break;
                   }
                   else{
                       System.out.println("******* No books collection found  *******\n");
                   }
                }
                // View Book Details
                case 4: 
                {
                    if (no_books > 0){
                        System.out.println("Enter a book number for details");
                        int num = input.nextInt();
                         String s = schoolBooks.viewBook(num);
                         System.out.println(s);
                        break;
                    }
                }
                // Program Exit 
                case 5:
                {
                    flag = false;
                    break;
                }      
             }
           }
        }
    }

    
               
 
        

    

    