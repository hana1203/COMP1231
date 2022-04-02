package inheritance.p3;

public class ReadingTest {
    public static void main(String[] args) {
        Books books = new Books(300, "Cooking book");
        System.out.println(books.showInfo()); //The pages are 300 and the book name is Cooking book
        Novels novels = new Novels(100, "Chocolate Cake", "Matilda");
        System.out.println(novels); //inheritance.p3.Novels@54bedef2
        System.out.println(novels.showInfo()); //The pages are 100 and the book name is Chocolate Cake
        System.out.println(novels.showChars()); //Main characters: Matilda

    }
}
