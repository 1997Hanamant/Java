 package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public class EngineerDaoImpl implements EngineerDao {
private	EngineerDto[] engineer=new EngineerDto[5];
private int index;
public	boolean save(EngineerDto dto) {
	if(this.index<this.engineer.length) {
	this.engineer[index]=dto;
	this.index++;
	System.out.println(dto);
}
return true;
		
	
	}

}


