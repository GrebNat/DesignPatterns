package structual.composite.exec;

import java.util.ArrayList;

public class BookCollection implements Takeable{

    ArrayList<Takeable> books = new ArrayList<>();

    public void addBook( Takeable book){
        books.add(book);
    }

    public void checkout(){
        books.forEach(Takeable::checkout);
    }

    public void returnBook(){
        books.forEach(Takeable::returnBook);
    }
}
