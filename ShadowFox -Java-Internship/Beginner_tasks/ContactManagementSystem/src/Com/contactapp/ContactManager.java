//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Com.contactapp;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList();

    public boolean addContact(Contact contact) {
        if (this.isDuplicate(contact.getPhone())) {
            return false;
        } else {
            this.contacts.add(contact);
            return true;
        }
    }

    private boolean isDuplicate(String phone) {
        for(Contact c : this.contacts) {
            if (c.getPhone().equals(phone)) {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Contact> getContacts() {
        return new ArrayList(this.contacts);
    }

    public boolean updateContact(String name, String phone, String email) {
        for(Contact c : this.contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setPhone(phone);
                c.setEmail(email);
                return true;
            }
        }

        return false;
    }

    public boolean deleteContact(String name) {
        Iterator<Contact> it = this.contacts.iterator();

        while(it.hasNext()) {
            Contact c = (Contact)it.next();
            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
                return true;
            }
        }

        return false;
    }

    public ArrayList<Contact> searchContacts(String keyword) {
        ArrayList<Contact> result = new ArrayList();

        for(Contact c : this.contacts) {
            if (c.getName().toLowerCase().contains(keyword.toLowerCase()) || c.getPhone().contains(keyword) || c.getEmail().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(c);
            }
        }

        return result;
    }
}