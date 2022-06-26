
package librarysystem;

    class Book {

     private int bookNumber;
     private String title;
     private String mainAuthor;
     private String genre;
     private int year;

    public Book(int bn,String title,String author,String genre,int year)
    {
        this.bookNumber = bn;
        this.title = title;
        this.mainAuthor = author;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getMainAuthor() {
        return mainAuthor;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    @Override
    public String toString() {
        String s = "";
                s = "\n           Book\n";
                s += "===========================";
                s += "\nTitle: " + title + "\nMainAuthor: " + mainAuthor + "\nGenre: " + genre + "\nYear: " + year + "\nBook Number: " + bookNumber + "\n";
                s += "===========================\n";
                return s;
    }
}