package com.mycompany.task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Student {
private String sName;
private Integer deptId;
private Department department;
private College c;
public Student() {
}
public Student(String name, int id, Department dept,College c) {
this.deptId = id;
this.sName = name;
this.department = dept;
this.c=c;
}
public String getsName() {
return sName;
}
public void setsName(String sName) {
this.sName = sName;
}
public Integer getDeptId() {
return deptId;
}
public void setDeptId(Integer deptId) {
this.deptId = deptId;
}
public Department getDepartment() {
return department;
}
public void setDepartment(Department department) {
this.department = department;
}
public College getCollege() {
return c;
}
public void setCollege(College c) {
this.c = c;
}
@Override
public String toString() {
return "Student [sName=" + sName + ", deptId=" + deptId + ", department=" + department.getDeptName() +"collegename="+c.getCollegeName() +"]";
}
public String getDepartmentName() {
return this.getDepartment().getDeptName();
}
}


