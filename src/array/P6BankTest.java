package array;

public class P6BankTest {
    public static void main(String[] args) {
        P6Bank bank = new P6Bank();
        bank.createAccount("taeyeon", 10021, 50000);
        bank.deposit(10021,10000); //태연계좌에 만원 넣기
        P6Account taeyeon = bank.getAccount(10021);
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
