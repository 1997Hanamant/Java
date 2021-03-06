package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Service;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Excepation.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1.EngineerDao;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public class EngineerServiceImpl implements EngineerService {
	private	EngineerDao dao;

	@Override
	public boolean validAndSave(EngineerDto dto) throws InvalidDataException {
		if(dto!=null) {
			String name	=dto.getName();
			int age=dto.getAge();
			
			if(name!=null && name.length()>3 && name.length()<30){
			System.out.println("name is valid");
				
			}
			else {
				System.err.println("name is invlaid");
				throw new InvalidDataException("name is invalid check again");
			}
			if(age>20) {
				System.out.println("age is valid");
				
			}
			else {
				System.err.println("age is Invalid");
				throw new InvalidDataException("age is invalid plz check the age ");
			}
			return this.dao.save(dto);
		}

		return false;
	}

	public EngineerServiceImpl(EngineerDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public EngineerDto getEngineer(int age) {
		return dao.getEngineer(age);
	}

	@Override
	public void updateNameByAge(String nameToUpdate, int age) {
	if(nameToUpdate!=null && nameToUpdate.length()>3 && nameToUpdate.length()<30) {
		this.dao.updateNameByAge(nameToUpdate, age);
		
	}
		
	}

	@Override
	public void deleteNameByAge(String nameToDelete, int age) {
		if(nameToDelete!=null && nameToDelete.length()>3 && nameToDelete.length()<30) {
			this.dao.deleteNameByAge(nameToDelete, age);
		}
		
	}


}
