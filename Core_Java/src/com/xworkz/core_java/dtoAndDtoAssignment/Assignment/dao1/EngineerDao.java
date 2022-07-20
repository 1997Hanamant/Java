package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public interface EngineerDao {
	public	boolean save(EngineerDto dto);
	EngineerDto getEngineer(int age);
	public void updateNameByAge(String nameToUpdate,int age);
	public void deleteNameByAge(String nameToDelete,int age);

}
