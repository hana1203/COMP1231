package polymorphism;

//Represents the personnel staff of a particular business.
public class Staff {
    private StaffMember[] staffList;

    //Constructor: Sets up the list of staff members.
    public Staff() {
        staffList = new StaffMember[6];
        staffList[0] = new Executive("Dobby", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Draco", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Lucius", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Fudge", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Adrianna", "987 Babe Blvd.", "555-8374");
        staffList[5] = new Volunteer("Benny", "321 Dud Lane", "555-7282");
        ((Executive)staffList[0]).awardBonus(500.0);
        ((Hourly)staffList[3]).addHours(40);

        //bonus = 0 이 무슨역할하는지 보려고
        ((Executive)staffList[0]).awardBonus(100.0);
    }

    //Pays all staff members.
    public void payday() {
        double amount;
        for (int count=0; count<staffList.length; count++){
            System.out.println(staffList[count]);
            amount = staffList[count].pay();
            if (amount == 0.0) {
                System.out.println("Thanks for your volunteer");
            }
            else {
                System.out.println("Paid: "+amount);
            }
            System.out.println("====================");
        }
    }



}
