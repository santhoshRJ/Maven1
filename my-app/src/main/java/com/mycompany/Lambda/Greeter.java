package com.mycompany.Lambda;

interface Greeting {
	public void say();
}

 class Greeter{
public static void main(String[] args) {
	//Greeter greeter=new Greeter();
	//HelloGreeting helloGreeting=new HelloGreeting();
	//greeter.greet(helloGreeting);
	Greeting g=()->{

	
		System.out.println("Hello World");};
		g.say();
		
	}
}

