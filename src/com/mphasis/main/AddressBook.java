package com.mphasis.main;
import com.mphasis.control.*;
import java.util.Scanner;

public class AddressBook {
    public static void main(String args[])throws Exception {
        System.out.println("welcome to address book");
        AddressBookController address_controller=new AddressBookController();
        System.out.println("1. to create a new csv file");
        System.out.println("2. to open the csv file");
        System.out.println("3. to add person data");
        System.out.println("4. to modify person data");
        System.out.println("5. to delete a person data");
        System.out.println("6. to display all persons data in the file");
        System.out.println("7. to delete the file");
        System.out.println("enter the option");
        Scanner scanner=new Scanner(System.in);
        int option =scanner.nextInt();
        switch (option) {
            case 1:
                address_controller.Create();
                break;
            case 2:
                System.out.println("Firstname Last name Address City State Pin-code Number");
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
                System.out.println("Firstname Last name Address City State Pin-code Number");
                address_controller.allPersons();
                break;
            case 7:
                address_controller.quit();
                break;
            default:
                System.out.println("enter correct option");
                break;

        }
    }
}
