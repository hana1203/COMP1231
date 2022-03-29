package array;
//Variable length parameter list
public class Family {

    private String[] members;

    public Family(String ...names) {
        members = names; //복수형이라 그런지 this 키워드로는 안되네
    }

    //by using a variable-length parameter list for the constructor,
    // we make it easy to create a family of any size.

    public String toString() {
        String result = "";
        for (String name : members) {
            result += name+"\t";
        }
        return result;
    }


}
