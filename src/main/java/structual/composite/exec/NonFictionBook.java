package structual.composite.exec;

public class NonFictionBook implements Takeable{
    String name;
    boolean isCheckedOut;

    public NonFictionBook(String name) {
        this.name = name;
            isCheckedOut = false;
    }

    public void checkout() {
        if (!isCheckedOut) {
            System.out.println("Checking out " + name);
            isCheckedOut = true;
        } else
            System.out.println(name + " is already checked out");
    }

    public void returnBook() {
        if (isCheckedOut) {
            System.out.println("returning " + name);
            isCheckedOut = false;
        } else
            System.out.println(name + " is not checked out");
    }
}
