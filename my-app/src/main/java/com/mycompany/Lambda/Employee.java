package com.mycompany.Lambda;
public class Employee{
    private String name;
    private int id,age;
    private String gender;
    Employee(String name,int id,int age,String gender){
        this.name=name;
        this.id=id;
        this.age=age;
        this.gender=gender;
    }
   
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public String toString()
    {
        return name+id+age+gender;
    }
    


}