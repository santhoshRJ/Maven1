package com.mycompany.Lambda;
import java.util.function.Predicate;
import java.util.*;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Predicat1{
    public static Predicate<Employee> isMale()
    {
        return q->q.getAge()>21 && q.getGender().equalsIgnoreCase("M");
    }
    public static Predicate<Employee> isFemale(){
        return q->q.getAge()<18 && q.getGender().equalsIgnoreCase("F");
    }
    public static List<Employee> method1(List<Employee> emp,Predicate<Employee> pred){
        return emp.stream().filter(pred).collect(Collectors.<Employee>toList());
    }
    
} 