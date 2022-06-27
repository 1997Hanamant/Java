package com.xworkz.core_java.javaLibraies.tostring.assingment.assingment1;

public class Window {
	String type;
	double length;
	double width;
	
	Window(String type,double length,double width){
		this.type=type;
		this.length=length;
		this.width=width;
	}
	public String toString() {
		return "Type:"+" "+type+"Length:"+" "+length+"width:"+" "+width;
		
	}

}
