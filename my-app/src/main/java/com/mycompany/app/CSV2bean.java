package com.mycompany.app;

import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

class CSV2bean {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("D://Maven1//my-app//src//main//java//com//mycompany//app//emp.csv"), ',');

ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
beanStrategy.setType(Employee.class);
beanStrategy.setColumnMapping(new String[] {"name", "id",  "age", "country" });

CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();

List<Employee> emps = csvToBean.parse(beanStrategy, reader);

System.out.println(emps);

}
}