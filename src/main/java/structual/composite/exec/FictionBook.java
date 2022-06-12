package structual.composite.exec;

public class FictionBook implements Takeable{

    String name;
    boolean isAPlay;
    boolean isCheckedOut;

    public FictionBook(String name, boolean isAPlay) {
        this.name = name;
        this.isAPlay = isAPlay;
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
