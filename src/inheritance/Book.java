package inheritance;

public class Book {
    protected int pages;

    //Constructor
    public Book(int numPages) {
        pages = numPages;
    }

    public void setPages(int numPages) {
        pages = numPages;
    }

    public int getPages() {
        return pages;
    }
}
