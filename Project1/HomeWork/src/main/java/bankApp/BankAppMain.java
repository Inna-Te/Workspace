package bankApp;

import java.util.concurrent.Callable;

public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1, "10.01.1977", "Calgary");
        Accountant accountant1 = new Accountant("Mary Johns", 2, "05.06.1986", "Calgary");
        Accountant accountant2 = new Accountant("Sara Parker", 4,"25.08.1983", "Calgary");
        Accountant accountant3 = new Accountant("Olga Sidorov", 5, "04.12.1988","Calgary");
        Accountant accountant4 = new Accountant("Ivan Petrov", 3, "02.03.2000", "Calgary");
        Accountant accountant5 = new Accountant("Jane Air", 6, "06.07.1998", "Calgary");
        Clerk clerk1 = new Clerk("Linda Logan", 7, "13.09.2000", "Calgary");
        Clerk clerk2 = new Clerk("Alex Lee", 8,"22.03.1985", "Calgary");
        Clerk clerk3 = new Clerk("Oleg Kotov", 9, "17.01.1979","Calgary");


        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(accountant2.toString());
        System.out.println(accountant3.toString());
        System.out.println(accountant4.toString());
        System.out.println(accountant5.toString());
        System.out.println(clerk1.toString());
        System.out.println(clerk2.toString());
        System.out.println(clerk3.toString());


        manager.fireEmployee("Ivan Petrov");

        accountant1.createReport("Mary Johns");

        accountant2.openNewAccount("Sara Parker");

        accountant3.closeAccount("Olga Sidorov");

        clerk1.makeCall("Irina Ivanova");

        clerk2.getCall("Mark Darcy");

        accountant1.setName("Mary Petrov");
        System.out.println(accountant1.toString());

        clerk3.receiveSalary("Oleg Kotov");


    }
}
