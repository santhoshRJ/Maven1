
package com.mycompany.app;
import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

//import java.io.IOException;
//import com.opencsv.CSVReader;
public class Csvbook{
    public static void main(String[] args) throws IOException  {
        CSVReader c = new CSVReader(new FileReader("D://Maven1//my-app//src//main//java//com//mycompany//app//v.csv"),',');
        String[] s = null;
        List<Book> b = new ArrayList<Book>();
        while((s = c.readNext()) != null)
        {
        Book bobj = new Book();
       bobj.setId(s[0]);
      bobj.setName(s[1]);
       bobj.setAname(s[2]);
       bobj.setPrice(s[3]);
        b.add(bobj);
    }
    System.out.println(b);
    c.close();
}
}