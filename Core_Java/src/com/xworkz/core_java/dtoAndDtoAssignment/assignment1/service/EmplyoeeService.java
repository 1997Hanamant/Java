package com.xworkz.core_java.dtoAndDtoAssignment.assignment1.service;

import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.Exception.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dto.EmplyoeeDto;

public interface EmplyoeeService {
	public boolean validAndSave(EmplyoeeDto dto) throws InvalidDataException;
	EmplyoeeDto getEmplyoee(int age); 
	public void updateNameByAge (String nameToUpdate,int age) throws InvalidDataException;
	public void deleteNameByAge (String nameToDelete,int age)throws InvalidDataException;
		
	}

