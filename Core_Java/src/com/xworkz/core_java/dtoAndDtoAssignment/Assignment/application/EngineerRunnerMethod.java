package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.application;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Excepation.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Service.EngineerService;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Service.EngineerServiceImpl;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1.EngineerDao;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1.EngineerDaoImpl;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public class EngineerRunnerMethod {
	public static void main(String[] args) {
		EngineerDto  dto=new EngineerDto("Ravi",28);
		EngineerDao dao=new EngineerDaoImpl();
		EngineerService service=new EngineerServiceImpl(dao);
		 EngineerDto engineer=service.getEngineer(28);
		try {
			 service.validAndSave(dto);
	         service.updateNameByAge("Raja", 28);
	         service.deleteNameByAge("Raja", 28);
	         System.out.println(engineer);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}

}
