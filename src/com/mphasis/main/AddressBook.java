package com.mphasis.main;
import com.mphasis.control.*;
import java.util.Scanner;

public class AddressBook {
    public static void main(String args[])throws Exception {
        System.out.println("welcome to address book");
        AddressBookController address_controller=new AddressBookController();


        Scanner scanner=new Scanner(System.in);
        boolean i=true;
        while (i) {
            System.out.println("1. to create a new csv file");
            System.out.println("2. to open the csv file");
            System.out.println("3. to add person data");
            System.out.println("4. to modify person data");
            System.out.println("5. to delete a person data");
            System.out.println("6. to display all persons data in the file");
            System.out.println("7 to display single person record");
            System.out.println("8. to sort person by last name");
            System.out.println("9. to sort person by zip code");
            System.out.println("10. to delete the file");
            System.out.println("11. to quit the program");
            System.out.println("enter the option");
            int option =scanner.nextInt();
        switch (option) {
            case 1:
                address_controller.Create();
                break;
            case 2:
                address_controller.open();
                break;
            case 3:
                address_controller.add();
                break;
            case 4:
                address_controller.modify();
                break;
            case 5:
                address_controller.deleteRecord();
                break;
            case 6:
                address_controller.allPersons();
                break;
            case 7:
                address_controller.printPerson();
                break;
            case 8:
                address_controller.sortPersonLastName();
                break;
            case 9:
                address_controller.sortPersonPinCode();
                break;
            case 10:
                address_controller.deleteFile();
                break;
            case 11:
                System.out.println("address book has end");
                i=false;
                break;
            default:
                System.out.println("enter correct option");
                break;
        }

        }
    }
}
