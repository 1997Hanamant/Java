package com.xworkz.core_java.dtoAndDtoAssignment.assignment1.service;

import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.Exception.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dao.EmplyoeeDao;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dto.EmplyoeeDto;

public class EmplyoeeServiceImpl implements EmplyoeeService {
	private EmplyoeeDao dao;

	@Override
	public boolean validAndSave(EmplyoeeDto dto) throws InvalidDataException {
		if(dto!=null) {
			String name=dto.getName();
			int age=dto.getAge();
			String desigantion=dto.getDesigantion();
			if(name!=null && name.length()>3 && name.length()<30) {
				System.out.println("name is valid");
			}
			else {
				System.out.println("name is not valid");
				throw new InvalidDataException("name is not valid plz check it");
			}
			if(age>25) {
				System.out.println("age is valid");
			}
			else {
				System.out.println("age is not valid");
				throw new InvalidDataException("age is not valid plz check it");
				
			}
			if(desigantion!=null && desigantion.length()>10 && desigantion.length()<50) {
				System.out.println("Desigantion information is valid");
			}
			else {
				System.out.println("Desigantion information is not valid ");
				throw new InvalidDataException("Desiganation is not valid plz check it");
			}
			return this.dao.save(dto);
		}
		return false;
	}
	public EmplyoeeServiceImpl(EmplyoeeDao dao) {
		super();
		this.dao=dao;
	}
	public EmplyoeeDto getEmplyoee(int age) {
		return dao.getEmplyooe(age) ;
	}
	@Override
	public void updateNameByAge(String nameToUpdate, int age) throws InvalidDataException {
		if (nameToUpdate != null&& nameToUpdate.length()>3 && nameToUpdate.length()<30 ) {
		this.dao.updateNameByAge(nameToUpdate, age);
	}
		else {
			System.out.println("Update name is not valid");
		}
	
	}
	@Override
	public void deleteNameByAge(String nameToDelete, int age) throws InvalidDataException {
		if(nameToDelete!=null && nameToDelete.length()>3 && nameToDelete.length()<30) {
			this.dao.deleteNameByAge(nameToDelete, age);
		}
		else {
			System.out.println("delete name is not valid");
		}
		
	}
}
	


		