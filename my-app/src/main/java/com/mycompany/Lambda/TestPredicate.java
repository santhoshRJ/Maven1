package com.mycompany.Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Predicate;
import static com.mycompany.Lambda.Predicat1.*;
class TestPredicate{
   public static void main(String[] args) {
       Employee e1=new Employee("aaa", 11, 21, "M");
       Employee e2=new Employee("bbb", 12, 23, "M");
       Employee e3=new Employee("NNN", 13, 10, "f");
       Employee e4=new Employee("MMM", 14, 19, "F");
              List<Employee> emp=new ArrayList<Employee>();
              emp.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4}));
              System.out.println(method1(emp,isMale()));
                System.out.println(method1(emp,isFemale()));
                System.out.println(e1);

   }
}