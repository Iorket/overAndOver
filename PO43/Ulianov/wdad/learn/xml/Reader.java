package PO43.Ulianov.wdad.learn.xml;

import java.util.Date;

public class Reader extends Person{
    private Date takedate;
    private Book book;
    public Reader(String firstname, String secondname,Date takedate,Book book) {
        super(firstname,secondname);
        this.book=book;
        this.takedate=takedate;
    }

    public Book getBook() {
        return book;
    }

    public Date getTakedate() {
        return takedate;
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