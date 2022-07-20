package com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dao;

import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dto.EmplyoeeDto;

public interface EmplyoeeDao {
	public boolean save(EmplyoeeDto dto);
	EmplyoeeDto getEmplyooe(int age);
	public void updateNameByAge (String nameToUpdate,int age);
	public void deleteNameByAge (String nameToDelete,int age);
	
		
	}

