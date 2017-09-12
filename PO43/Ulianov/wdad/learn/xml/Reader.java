package PO43.Ulianov.wdad.learn.xml;

import java.util.Date;

public class Reader extends Person{

    public Reader(String firstname, String secondname,Date takedate,Book book) {
        super(firstname,secondname);

    }
    @Override
    public String getFirstname() {
        return super.getFirstname();
    }

    @Override
    public String getSecondname() {
        return super.getSecondname();
    }
}