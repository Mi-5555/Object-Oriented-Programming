public class Book{
    //Static Variable (class var)
    private static int totalBooks = 0; //putting static makes it class variable  or shared var for all instances
    //if not static every var will have its own title, author, isbn

    //Instance var
    private String title;
    private String author;
    private String isbn;

    //Constructor
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;  //incrementing static var
    }

    //Instance Method
    public String displayInfo(){
        return "Title: " + title + ", Author: " + author + ",isbn: " + isbn;
    }

    //Static method(class method)
    public static int getTotalBooks(){
        return totalBooks;
    }

    public static void main(String[] args){  // we put static here for main bcz we need not to create object of it
    // else we have to  create object first and then main() function call
    // i.e. (new Book("title", "author", isbn)).main() -- NO for JVM
    // Due to static in psvm, we do: Book.main()   ---JVM does this
    // JVM doesn't need to create the object of a Book object it already has 3 things - Title, author, isbn
    // JVM needs to only run the class
        Book book1 = new Book("1984", "George Orwell", "1234567890123");
        Book book2 = new Book("To Kill a Mockingbird", " Harper Lee", "1234567890124");
        System.out.println(book1.displayInfo()); //Using instance method
        System.out.println("Total number of books:", Book.getTotalBooks()); //Using static method, without needing an object

    }
}


Constructor v/s Instance 
//We cant have instance method with the "same name as class", with "return type"
//while constructor doesnt have