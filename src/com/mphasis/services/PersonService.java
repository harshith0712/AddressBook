package com.mphasis.services;
import com.mphasis.model.Person;
import java.io.*;
import java.lang.String;
import java.util.*;
import com.opencsv.*;
public class PersonService {
    public final String comma=" ";
    public void addPerson()throws Exception {

        Person persondata=new Person("First Name","Last Name","Address","City","State","Pin-code","Number");
        Person persondata1 = new Person("harshith", "kolagatla", "gandhi nagar", "chennai", "tamil nadu", "631003", "9440036362");
        Person persondata2=new Person("kolli","kiran","nehru nagar","delhi","delhi","123456","1234567890") ;
        ArrayList<Person> list=new ArrayList<Person>();
        list.add(persondata);
        list.add(persondata1);
        list.add(persondata2);
        File add=new File("D:\\AddressBook\\address_book\\AddressBook.csv");
        PrintWriter add_person=new PrintWriter(add);
        for(Person person: list) {
            add_person.printf("%s ,%s ,%s ,%s ,%s ,%s ,%s \n",person.getFirstName(),person.getLastName(),person.getAddress(),person.getCity(),person.getState(),person.getPinCode(),person.getNumber());

        }
        add_person.close();
/*
        FileWriter add_person=new FileWriter("D:\\AddressBook\\address_book\\AddressBook.csv");

        add_person.append(persondata.getFirstName());
        add_person.append(comma);
        add_person.append(persondata.getLastName());
        add_person.append(comma);
        add_person.append(persondata.getAddress());
        add_person.append(comma);
        add_person.append(persondata.getCity());
        add_person.append(comma);
        add_person.append(persondata.getState());
        add_person.append(comma);
        add_person.append(persondata.getPinCode());
        add_person.append(comma);
        add_person.append(persondata.getNumber());
        add_person.append(comma);

        add_person.flush();
        System.out.println("the person data is added");
        add_person.close();
*/

    }
    public void editDetailsOFPerson(int row,int col,String replace)throws Exception {

        File edit=new File("D:\\AddressBook\\address_book\\AddressBook.csv");
        CSVReader reader = new CSVReader(new FileReader(edit), ' ');
        List<String[]> csvBody = reader.readAll();
        csvBody.get(row)[col] =replace;
        reader.close();
        CSVWriter writer = new CSVWriter(new FileWriter(edit), ' ');
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();
    }
    public void deletePerson(int line)throws Exception {
/*
        File inputFile = new File("D:\\AddressBook\\address_book\\AddressBook.csv");
        File outputFile = new File("D:\\AddressBook\\address_book\\AddressBook.csv");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

       String lineToRemove ="";

        String currentLine;

        while((currentLine = reader.readLine()) != null) {

            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("\n"));
        }

        writer.close();
        reader.close();
*/
        File edit=new File("D:\\AddressBook\\address_book\\AddressBook.csv");
        CSVReader reader = new CSVReader(new FileReader(edit), ' ');
        List<String[]> csvBody = reader.readAll();
        csvBody.remove(line);
        reader.close();
        CSVWriter writer = new CSVWriter(new FileWriter(edit), ' ');
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();

    }


    public void sortPersonByLastName()throws Exception {
        //code
        String i;
        File sort = new File("D:\\AddressBook\\address_book\\AddressBook.csv");
        CSVReader reader = new CSVReader(new FileReader(sort));
        List<String[]> csvbody = reader.readAll();
    }
    public  void sortPersonByZipCode() {
        //code
    }

    public void allPersons()throws Exception {
        Scanner sc = new Scanner(new File("D:\\AddressBook\\address_book\\AddressBook.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }

        sc.close();


    }
    public void printPersonDetails() {


    }
}
//objects