package com.xworkz.core_java.constructor.constructor_chianing.Assingment.with_in_the_class_Assingment;

public class Mobile {
	String model;
	String color;
	String storage;
	
	 Mobile(){
		this("Remdi","Balck");
		
	}
    Mobile(String name,String color){
    	this.model=model;
    	this.color=color;
    	System.out.println("Calling Two parameterzied constructor");
    	System.out.println("this.model:"+this.model);
    	System.out.println("this.color:"+this.color);
    }
   Mobile(String name,String color,String storage){
    	this.model=model;
    	this.color=color;
    	this.storage=storage;
    	System.out.println("Calling Three parameterzied constructor");
    	System.out.println("this.model:"+this.model);
    	System.out.println("this.color:"+this.color);
    	System.out.println("this.storage:"+this.storage);
    	
    	
    }
    
}
