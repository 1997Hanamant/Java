package com.xworkz.core_java.dtoAndDtoAssignment.Assignment.application;

import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Excepation.InvalidDataException;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Service.EngineerService;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.Service.EngineerServiceImpl;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1.EngineerDao;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dao1.EngineerDaoImpl;
import com.xworkz.core_java.dtoAndDtoAssignment.Assignment.dto1.EngineerDto;

public class EngineerRunnerMethod {
	public static void main(String[] args) {
		EngineerDto  dto=new EngineerDto("Ravi",38);
		EngineerDao dao=new EngineerDaoImpl();
		EngineerService service=new EngineerServiceImpl(dao);
		try {
			boolean temp = service.validAndSave(dto);
			System.out.println(temp);

		} catch (InvalidDataException e) {
			e.printStackTrace();
		}




	}

}
