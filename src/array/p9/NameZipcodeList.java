package array.p9;

public class NameZipcodeList {
    private NameZipcode[] nameZipcodeList;
//    String firstNameInList;
//    String lastNameInList;
//    int zipCodeInList;
    NameZipcode user;

    public NameZipcodeList() {
        nameZipcodeList = new NameZipcode[2];
        for (int i=0; i<nameZipcodeList.length; i++){
            nameZipcodeList[i] = new NameZipcode();
        }
    }

    public String toString() {
//        String finalLine ="";
//        for (int k=0; k<nameZipcodeList.length; k++) {
//            firstNameInList = nameZipcodeList[k].firstName;
//            lastNameInList = nameZipcodeList[k].lastName;
//            zipCodeInList = nameZipcodeList[k].zipCode;
//            finalLine += "list#"+ (k+1) + "\t\tfirstname: "+ firstNameInList + "\t\tlastname: "+ lastNameInList + "\t\tzipcode: "+ zipCodeInList +"\n";
//        }
//        return
//            "The list of names and postal ZIP codes\n" + finalLine;

        System.out.println("The list of user info\n");
        int k;
        for (k=0; k <nameZipcodeList.length; k++) {
            user = nameZipcodeList[k];
            System.out.println("list#" +(k+1) + "\t\t" +user +"\n");
        } return "The list is ended";
    }
//    The list of user info
//
//    list#1		Dasom		Zzing		1101
//    address: 		city: Paris10		state: Paris		phone number: 109999
//
//    list#2		Mia		Zzing		10121
//    address: 		city: Boulder		state: Colorado		phone number: 12222
//
//    The list is ended
}


