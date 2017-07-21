public class Method {
private String MethodId;
private String MethodName;
//private List<Student> emp;
public Method() {
}
public Method(String id, String name) {
this.MethodName = name;
this.MethodId = id;
}
public String getMethodId() {
return MethodId;
}
public void setMethodId(String MethodId) {
this.MethodId = MethodId;
}
public String getMethodName() {
return MethodName;
}
public void setMethodName(String MethodName) {
this.MethodName = MethodName;
}
}
