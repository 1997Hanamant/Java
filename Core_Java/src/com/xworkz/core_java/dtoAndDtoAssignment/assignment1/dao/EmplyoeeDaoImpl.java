package com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dao;

import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dto.EmplyoeeDto;

public class EmplyoeeDaoImpl implements EmplyoeeDao {
	private EmplyoeeDto[] emplyoees = new EmplyoeeDto[5];

	private int index;

	@Override
	public boolean save(EmplyoeeDto dto) {
		if (this.index < this.emplyoees.length) {
			this.emplyoees[index] = dto;
			this.index++;
			System.out.println(dto);

		}
		return true;
	}

	@Override
	public EmplyoeeDto getEmplyooe(int age) {
		for (int i = 0; i < emplyoees.length; i++) {
			if (emplyoees[i] != null && emplyoees[i].getAge() == age) {
				return emplyoees[i];

			}
		}
		return null;
	}

	@Override
	public void updateNameByAge(String nameToUpdate, int age) {
		for (int i = 0; i < emplyoees.length; i++) {
			EmplyoeeDto dto = emplyoees[i];
			if (dto.getAge() == age) {
				dto.setName(nameToUpdate);
				System.out.println("Updated name is  " + nameToUpdate);
				break;
			}
		}
		
	}

	@Override
	public void deleteNameByAge(String nameToDelete, int age) {
		for (int i = 0; i < emplyoees.length; i++) {
			EmplyoeeDto dto = emplyoees[i];
			if (dto.getAge() == age) {
				dto.setName(nameToDelete);
				System.out.println("Deleted name is  " + nameToDelete);
				break;
			}

	}
}
}
