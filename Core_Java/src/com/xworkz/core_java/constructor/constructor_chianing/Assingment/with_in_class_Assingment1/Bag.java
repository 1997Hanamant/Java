package com.xworkz.core_java.constructor.constructor_chianing.Assingment.with_in_class_Assingment1;

public class Bag {
	String name;
	String color;
	double weight;
	
   Bag(){
	   this("nike","black");
	  // this("nike","black",10.20);
	   System.out.println("Calling Defalut Constructor");
	   
   }
   Bag(String name,String color){
	  // this("nike","black",10.20);
	   this.name=name;
	   this.color=color;
	   this.weight=weight;
	   System.out.println("Calling Two parameterzied Constructor");
	   System.out.println("this.name:"+this.name);
	   System.out.println("this.color:"+this.color);
	   System.out.println("this.weight:"+this.weight);
   }
   Bag(String name,String color,double weight){
	   this.name=name;
	   this.color=color;
	   this.weight=weight;
	   System.out.println("Calling Three parameterzied Constructor");
	   System.out.println("this.name:"+this.name);
	   System.out.println("this.color:"+this.color);
	   System.out.println("this.weight:"+this.weight);
	   
	   
   }
}
