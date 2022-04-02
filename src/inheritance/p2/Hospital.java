package inheritance.p2;
/*
Design and implement a set of classes that define the employees of a hospital:
doctor, nurse, administrator, surgeon, receptionist, janitor, and so on.
Include methods in each class that are named according to the services provided by that person and that print an appropriate message.
Create a driver class to instantiate and exercise several of the classes.
 */

class Hospital {
    public void work() {
        System.out.println("Someone works in hospital.");
    }
}

class Doctor extends Hospital {
    public void work() {
        System.out.println("Doctor works");
    }
}

class Nurse extends Hospital {
    public void work() {
        System.out.println("Nurse works");
    }
}

class Surgeon extends Hospital {
    public void work() {
        System.out.println("Surgeon works");
    }
}

