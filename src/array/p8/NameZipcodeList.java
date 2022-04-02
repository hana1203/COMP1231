package array.p8;

public class NameZipcodeList {
    private NameZipcode[] nameZipcodeList;
    String firstNameInList;
    String lastNameInList;
    int zipCodeInList;

    public NameZipcodeList() {
        nameZipcodeList = new NameZipcode[2];
        for (int i=0; i<nameZipcodeList.length; i++){
            nameZipcodeList[i] = new NameZipcode();
        }
    }

    public String toString() {
        String finalLine ="";
        for (int k=0; k<nameZipcodeList.length; k++) {
//            NameZipcode list = nameZipcodeList[k];
            firstNameInList = nameZipcodeList[k].firstName;
            lastNameInList = nameZipcodeList[k].lastName;
            zipCodeInList = nameZipcodeList[k].zipCode;
            finalLine += "firstname: "+ firstNameInList + "\t\tlastname: "+ lastNameInList + "\t\tzipcode: "+ zipCodeInList +"\n";
        }
        return
            "The list of names and postal ZIP codes\n" + finalLine;
    }

}


