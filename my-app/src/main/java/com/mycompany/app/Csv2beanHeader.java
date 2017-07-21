package com.mycompany.app;
import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.CsvToBean;

class Csv2beanHeader {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("D://Maven1//my-app//src//main//java//com//mycompany//app//emp.csv"), ',');
    
    HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
    beanStrategy.setType(Employee.class);
    
    CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
    List<Employee> emps = csvToBean.parse(beanStrategy, reader);
    
    System.out.println(emps);
    reader.close();
    
    //return emps;

}
}
