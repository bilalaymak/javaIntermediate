package practices.oop.overloading;

public class Library {

    //Type code to add books to library with its info(bookName, authorName, pageNumber), then create a method to show
    // information of the book
    String bookName;
    String authorName;
    int pageNumber;
    String bookID;

    static int numOfBooks;

    public Library() {

    }

    public static void main(String[] args) {

        Library book0= new Library();
        book0.display();

        Library book1= new Library("Crime and Punishment", "Dostoyevski", 450);


        book1.display();

        Library book2= new Library("Pride", "Jane Austen", 650);
        book2.display();

    }
    public Library(String bookName, String authorName, int pageNumber){

        this.bookName= bookName;
        this.authorName=authorName;
        this.pageNumber= pageNumber;
        numOfBooks++;
        bookID=bookName.substring(0, 2)+numOfBooks;

    }


    public void display(){

        System.out.println("Book Name: " + bookName + " Author Name: " + authorName + " Page : " + pageNumber + " Book ID: " + bookID);

    }









}
