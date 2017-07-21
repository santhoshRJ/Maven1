package com.mycompany.Lambda;
interface Sabari
{

int kercheif(int...a);
static void de()
{
System.out.println("hello");
}
}
interface Hello{
int hello(int num);
}
public class LambdaDemo //implements Sabari
{


public static void main(String[] args) {
int a=10,b=20;
Sabari s=(int...d)-> { System.out.println("hello"); int c=d[0]+d[1]; return c; };
System.out.println("hello"+s.kercheif(a,b));
Sabari.de();
Hello h=(int num)->{System.out.println("will it print "+num);
return num;};
Sabari.de();

System.out.println( h.hello(5));


//LambdaDemo l=new LambdaDemo();
// System.out.println( l.kercheif(a,b));

}

}