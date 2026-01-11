class Book{
    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void displayInfo(){
        System.out.println("Title: " + this.name + " # of pages: " + this.pages);

    }
}

class Library{
    String name;
    int year;
    Book[] books;

    //Constructor
    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.name + " was built in " + this.year);
        System.out.println("It contains the following books: ");
        for(Book book: this.books){
            book.displayInfo();
        }
    }
}


public class myLib {

    public static void main(String [] args){

        Book book1 = new Book("The Fellow of the RIng", 423);
        Book book2 = new Book("The two Towers", 352);
        Book book3 = new Book("The return of the king", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();

    }
}
