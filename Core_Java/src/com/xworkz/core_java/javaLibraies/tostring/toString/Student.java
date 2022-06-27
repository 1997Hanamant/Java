package com.xworkz.core_java.javaLibraies.tostring.toString;

public class Student {
	String name;
	int id;
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
		
	}
//	@Override
//	public String toString(){
	//	return "name:"+name+"id"+id;
//	}
	public static void main(String[] args) {
		Student s1=new Student("Kumar",100);
		Student s2=new Student("Raja",101);
		Student s3=new Student("Rani",102);
		
		Student[] s= {s1,s2,s3};
		
		//Student[] s=new Student[3];
		//s[0]=s1;
		//s[1]=s2;
		//s[2]=s3;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
			System.out.println(s[i].name+s[i].id);
		}
		
		
	}

}
