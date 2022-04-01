package array.p6;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("taeyeon", 10021, 50000);
        bank.deposit(10021,10000); //태연계좌에 만원 넣기
        Account taeyeon = bank.getAccount(10021);
        System.out.println(taeyeon.showAccountInfo());
//        bank.createAccount("tiffany", 10022, 30000);
//        bank.withdraw(10022,10000, 1000); //티파니계좌에서 만원 출금
        bank.showAllAccountInfo();
    //        Name: taeyeon		Balance: 60000.0
    //        Name: tiffany		Balance: 19000.0
//        bank.addInterest();
//        bank.showAllAccountInfo();
    //        Name: taeyeon		Balance: 61800.0
    //        Name: tiffany		Balance: 19570.0
    }
}
