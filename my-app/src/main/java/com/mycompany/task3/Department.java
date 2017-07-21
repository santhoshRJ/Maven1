package com.mycompany.task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Department {
private String deptId;
private String deptName;
private List<Student> emp;
public Department() {
}
public Department(String id, String name,List<Student> emp) {
this.deptName = name;
this.deptId = id;
this.emp=emp;
}
public String getDeptId() {
return deptId;
}
public void setDeptId(String deptId) {
this.deptId = deptId;
}
public String getDeptName() {
return deptName;
}
public void setDeptName(String deptName) {
this.deptName = deptName;
}
public List<Student> getSt() {
return emp;
}
public void setSt(List<Student> emp) {
this.emp = emp;
}
}
