package inheritance.p3;

public class Novels extends Reading{
    String maincharacter;
    public Novels(int numOfPages, String name, String mainChar){
        super(numOfPages, name);
        maincharacter = mainChar;
    }

    public String showChars() {
        return "Main characters: "+maincharacter;
    }
}
