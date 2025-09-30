//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Com.contactapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n==== Contact Manager ====");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    if (manager.addContact(new Contact(name, phone, email))) {
                        System.out.println("✅ Contact added successfully!");
                    } else {
                        System.out.println("⚠️ Duplicate phone found. Contact not added.");
                    }
                    break;
                case 2:
                    System.out.print("Enter name to update: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter new phone: ");
                    String uphone = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String uemail = sc.nextLine();
                    if (manager.updateContact(uname, uphone, uemail)) {
                        System.out.println("✅ Contact updated!");
                    } else {
                        System.out.println("⚠️ Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    String dname = sc.nextLine();
                    if (manager.deleteContact(dname)) {
                        System.out.println("\ud83d\uddd1️ Contact deleted.");
                    } else {
                        System.out.println("⚠️ Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    ArrayList<Contact> results = manager.searchContacts(keyword);
                    if (results.isEmpty()) {
                        System.out.println("⚠️ No contacts found.");
                    } else {
                        System.out.println("\ud83d\udd0e Search results:");

                        for(Contact c : results) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 5:
                    System.out.println("\ud83d\udcd6 All Contacts:");

                    for(Contact c : manager.getContacts()) {
                        System.out.println(c);
                    }
                    break ;
                case 6:
                    System.out.println("\ud83d\udc4b Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}