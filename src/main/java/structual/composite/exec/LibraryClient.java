package structual.composite.exec;

public class LibraryClient {
    public static void main(String[] args) {
        NonFictionBook nonFictionBook1 = new NonFictionBook("1 non fiction");
        FictionBook fictionBook1 = new FictionBook("1 fiction book", true);
        FictionBook fictionBook2 = new FictionBook("2 fiction book", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(fictionBook1);
        bookCollection.addBook(fictionBook2);
        bookCollection.addBook(nonFictionBook1);

        checkout(nonFictionBook1);
        returnBook(nonFictionBook1);
        returnBook(fictionBook1);
        returnBook(bookCollection);

    }

    public static void returnBook(Takeable takeable){
        takeable.returnBook();
    }
    public static void checkout(Takeable takeable){
        takeable.checkout();
    }
}
