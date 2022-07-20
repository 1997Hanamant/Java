package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public class EngineerDaoImpl implements EngineerDao {
	private EngineerDto[] engineer=new EngineerDto[5];
	private int index;

	@Override
	public boolean save(EngineerDto dto) {
		if(this.index<this.engineer.length) {
			this.engineer[index]=dto;
			this.index++;
			System.out.println(dto); 
		}
		return true;
	}
	public EngineerDto getEngineer(int age) {
		for(int i=0;i<engineer.length;i++) {
			if(engineer[i]!=null && engineer[i].getAge()==age){
				return engineer[i];

			}
		}
		return null;
	}
	@Override
	public void updateNameByAge(String nameToUpdate, int age) {
		for(int i=0;i<engineer.length;i++) {
			EngineerDto dto=engineer[i];
			if(dto.getAge()==age) {
				dto.setName(nameToUpdate);
				System.out.println("updated name is "+nameToUpdate+" "+dto+" ");
				break;
			}
		}
	}
@Override
	public void deleteNameByAge(String nameToDelete, int age) {
		for(int i=0;i<engineer.length;i++) {
			EngineerDto dto=engineer[i];
			if(dto.getAge()==age) {
				dto.setName(nameToDelete);
				System.out.println("deleted name is "+ nameToDelete+" ");
				break;
			}
		}

	}

}


