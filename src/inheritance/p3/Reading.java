package inheritance.p3;

public class Reading {
    int numOfPages;
    String name;

//    public Reading() {
//        numOfPages = 0;
//        name= "";
//    }

    public Reading(int numOfPages, String name) {
        this.numOfPages = numOfPages;
        this.name = name;
    }

    public String showInfo() {
        return "The pages are " + numOfPages + " and the book name is " + name;
    }
}
