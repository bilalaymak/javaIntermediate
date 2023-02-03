package practices.oop.constructors;

public class Q01 {

    //Type code to add books to library with its info(bookName, authorName, pageNumber), then create a method to show
    // information of the book
    String bookName;
    String authorName;
    int pageNumber;
    String bookID;

    static int numOfBooks;

    public Q01() {

    }

    public static void main(String[] args) {

        Q01 book0= new Q01();
        book0.display();

        Q01 book1= new Q01("Crime and Punishment", "Dostoyevski", 450);


        book1.display();

        Q01 book2= new Q01("Pride", "Jane Austen", 650);
        book2.display();

    }
    public Q01(String bookName, String authorName, int pageNumber){

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
