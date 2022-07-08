package com.xworkz.core_java.dtoandDao.service;

import com.xworkz.core_java.dtoandDao.dao.StudentDAO;
import com.xworkz.core_java.dtoandDao.dao.StudentDAOImpl;
import com.xworkz.core_java.dtoandDao.dto.StudentDTO;

public class StudentServiceimpl implements StudentService {
	 StudentDAO studentDAO=new StudentDAOImpl();

	@Override
	public void addStudent(StudentDTO dto) {
		long number=dto.getphoneNo();
         int count = 0;
		while (number > 0) {
		number = number / 10;
			count++;		
			}
		if (count == 10) {
			studentDAO.addStudent(dto);
			System.out.println(dto);
			

		} else {
			System.out.println("Invalid number");
		}
	}
	

	@Override
	public StudentDTO getStudent(long phoneNo) {
			return studentDAO.getStudent(phoneNo);
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		long number=dto.getphoneNo();
        int count = 0;
		while (number > 0) {
		number = number / 10;
			count++;		
			}
		if (count == 10) {
			studentDAO.updateStudent(dto);
			System.out.println(dto);
			

		} else {
			System.out.println("Invalid number");
		}
	}


	@Override
	public void  deleteStudent(StudentDTO dto) {
		long number=dto.getphoneNo();
        int count = 0;
		while (number > 0) {
		number = number / 10;
			count++;		
			}
		if (count == 10) {
			studentDAO.deletStudent(dto);
			

		} else {
			System.out.println("Invalid number");
		}

		
	}
	
}




