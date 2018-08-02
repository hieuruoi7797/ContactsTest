package vn.hieuruoi.contactstest;

public class Contact {
    private String mName;
    private String mNumber;

    public Contact() {
    }

    public Contact(String name, String number) {
        mName = name;
        mNumber = number;
    }

    public String getName() {
        return mName;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setNumber(String number) {
        mNumber = number;
    }
}

