package com.xworkz.core_java.constructor.constructor_chianing;

public class Tiger{
		String name;
		String color;
		String gender;
		Tiger(){
			this("rio","black");
			System.out.println("d");
		}
		Tiger(String name,String color){
			this("rio","white","male");
			this.name=name;
			this.color=color;
			System.out.println("Calling Two parmterzied constructor");
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.gender);
			
	}
      Tiger(String name,String color,String gender){
    	
    	  this.name=name;
    	  this.color=color;
    	  this.gender=gender;
    	  System.out.println("calling Three parmeterzied constructor");
    	  System.out.println(this.name);
		  System.out.println(this.color);
		  System.out.println(this.gender);
      }
}
