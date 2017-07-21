package com.mycompany.task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class College {
//private String CollegeId;
private String CollegeName;
private List<Department> emp;
public College() {
}
public College(String name,List<Department> dept) {
this.CollegeName = name;
this.emp = dept;
}
/*public String getCollegeId() {
return CollegeId;
}
public void setCollegeId(String CollegeId) {
this.CollegeId = CollegeId;
}*/
public String getCollegeName() {
return CollegeName;
}
public void setCollegeName(String CollegeName) {
this.CollegeName = CollegeName;
}
public List<Department> getSt() {
return emp;
}
public void setSt(List<Department> emp) {
this.emp = emp;
}
}
