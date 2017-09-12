package PO43.Ulianov.wdad.learn.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class XmlTask {
    Document doc;
    String xmlFileName;
    XmlTask(String xmlFile){
        try{
            this.xmlFileName =xmlFile;
            File inputFile = new File(xmlFile);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private Element noteWithReader(Reader reader){
        NodeList readerList=doc.getElementsByTagName("reader");
        for(int noteCounter=0;noteCounter<readerList.getLength();noteCounter++) {
            Element note = (Element) readerList.item(noteCounter);
            if(note.getAttribute("firstname").equals(reader.getFirstname())&&
                    note.getAttribute("secondname").equals(reader.getSecondname())) {
                return note;}
        }
        return null;
    }

    public List<Reader> negligentReaders() {

        NodeList readerList = doc.getElementsByTagName("reader");
        for (int readerCounter = 0; readerCounter < readerList.getLength(); readerCounter++) {
            Element note = (Element) readerList.item(readerCounter);
            NodeList bookList = note.getElementsByTagName("takedate");
            for (int tDateCounter = 0; tDateCounter < bookList.getLength(); tDateCounter++) {
                Element takeDate = (Element) bookList.item(tDateCounter);
              
            }
        }
    }
    public void removeBook(Reader reader,Book book) {}
    public void addBook(Reader reader,Book book){}
    public List<Book> negligentBook(Reader reader){
        return null;
    }
    public boolean twoWeeksPassed(int day,int month,int year){
        int currentYear,currentDay,currentMonth;
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar now = Calendar.getInstance();
        currentYear=now.get(Calendar.YEAR);
        currentMonth=now.get(Calendar.MONTH);
        currentDay=now.get(Calendar.DAY_OF_MONTH);
        //CRUEL IFIFIFIF(можно было сделать магию с миллисекундами,но ......вот((eng) i`m idiot))
        /*if(currentYear-year>1||currentMonth-month>1||currentDay-day>14){return true;}
        else if(currentYear-year==1){
            if(currentMonth==1 && month==12){
                //more if for IFGOD
                int subDays=day-currentDay;
                if(subDays<17){return true;}
                else return false;
            }
            else return false;
        }
        else if(month==currentMonth){
            if(currentDay-day>14) return true;
            else return false;
        }
        else if(month<currentMonth){
            switch (month)
            {
                case 2:
                    if(day-currentDay<) return true;
                    else return false;
            }
        }
        */
        return true;
    }
}
