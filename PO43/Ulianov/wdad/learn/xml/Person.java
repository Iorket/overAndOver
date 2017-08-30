package PO43.Ulianov.wdad.learn.xml;

public class Person {
    private String firstname;
    private String secondname;
    public Person(String firstname,String secondname){
        this.firstname=firstname;
        this.secondname=secondname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }
}
