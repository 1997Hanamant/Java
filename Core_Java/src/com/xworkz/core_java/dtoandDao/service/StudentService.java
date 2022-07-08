package com.xworkz.core_java.dtoandDao.service;

import com.xworkz.core_java.dtoandDao.dto.StudentDTO;

public interface StudentService {
	void  addStudent(StudentDTO dto); 
	StudentDTO getStudent(long phoneNo);
	void updateStudent(StudentDTO dto);
	void deleteStudent(StudentDTO dto);


}
