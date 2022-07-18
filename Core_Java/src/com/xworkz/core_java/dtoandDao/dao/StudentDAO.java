package com.xworkz.core_java.dtoandDao.dao;

import com.xworkz.core_java.dtoandDao.dto.StudentDTO;

public interface StudentDAO {
	int total_Size=10;
	void addStudent(StudentDTO dto);
    StudentDTO getStudent(long phoneNo);
    void updateStudent(StudentDTO dto);
    void deletStudent(StudentDTO dto);

}
