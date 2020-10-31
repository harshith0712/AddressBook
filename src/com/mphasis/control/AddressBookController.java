package com.mphasis.control;
import java.util.*;
import com.mphasis.services.*;

public class AddressBookController {
    public void Create()throws Exception {
        AddressBookService address_service = new AddressBookService();
        address_service.newAddressbook();
    }
    public void open() {
        try {
            AddressBookService address_service = new AddressBookService();
            address_service.openExistingAddressBook();
        }
        catch (Exception e) {

        }

    }
    public void add()throws Exception {
        PersonService person_service=new PersonService();
        person_service.addPerson();
    }
    public void modify() throws Exception {
        PersonService person_service=new PersonService();
        person_service.editDetailsOFPerson(1,2,"gandhi");
    }
    public void deleteRecord() throws Exception {
        System.out.println("enter which line to be deleted");
        Scanner scanner=new Scanner(System.in);
        int line=scanner.nextInt();
        PersonService person_service=new PersonService();
        person_service.deletePerson(line);
    }
    public void allPersons()throws Exception {
        PersonService person_service=new PersonService();
        person_service.allPersons();
    }
    public void deleteFile() {
        AddressBookService address_service = new AddressBookService();
        address_service.deleteAddressBook();
    }
}
