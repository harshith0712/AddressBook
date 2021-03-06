package com.mphasis.services;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class AddressBookService {
    public void newAddressbook ()throws Exception {



        File createFile = new File("D:\\AddressBook\\address_book\\AddressBook.csv");

        boolean flag = createFile.createNewFile();
        if (flag) {
            System.out.println("File has been created successfully at the specified location");
        } else {
            System.out.println("File already present at the specified location");
        }
    }
    public void openExistingAddressBook()throws Exception {
        Scanner scanner = new Scanner(new File("D:\\AddressBook\\address_book\\AddressBook.csv"));
        scanner.useDelimiter(" ");
        while (scanner.hasNext()) {
            System.out.print(scanner.next());
        }

        scanner.close();
    }
    public void deleteAddressBook() {
        File quit = new File("D:\\AddressBook\\address_book\\AddressBook.csv");
        if (quit.delete())
            System.out.println("Deleted the file: " + quit.getName());
        else
            System.out.println("Failed to delete the file.");

    }
}
