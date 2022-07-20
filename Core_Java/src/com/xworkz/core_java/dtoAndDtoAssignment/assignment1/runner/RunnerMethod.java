package com.xworkz.core_java.dtoAndDtoAssignment.assignment1.runner;

import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.Exception.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dao.EmplyoeeDao;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dao.EmplyoeeDaoImpl;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.dto.EmplyoeeDto;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.service.EmplyoeeService;
import com.xworkz.core_java.dtoAndDtoAssignment.assignment1.service.EmplyoeeServiceImpl;

public class RunnerMethod {
	public static void main(String[] args) {
		EmplyoeeDto dto = new EmplyoeeDto("Raja", 26, "SoftwareEngineer");
		EmplyoeeDao dao = new EmplyoeeDaoImpl();
		EmplyoeeService service = new EmplyoeeServiceImpl(dao);
		EmplyoeeDto emplyoees = service.getEmplyoee(26);
		System.out.println("Emplyoee Details");
		try {
			service.validAndSave(dto);
			service.updateNameByAge("suhas", 26);
			service.deleteNameByAge("suhas", 26);
			System.out.println(emplyoees);

		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}
}