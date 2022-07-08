package com.xworkz.core_java.dtoandDao.Arry_Demo;

import com.xworkz.core_java.dtoandDao.dto.StudentDTO;
import com.xworkz.core_java.dtoandDao.service.StudentService;
import com.xworkz.core_java.dtoandDao.service.StudentServiceimpl;

public class ArryApplication {
	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO("1", "Darshan", "BTM01", 1234567890l, "70%");
		StudentService service=new StudentServiceimpl();
		service.addStudent(dto);
		StudentDTO student = service.getStudent(1234567890l);
		
		
		System.out.println("Student Deatils");
		System.out.println(student);
		student.setname("Darshan Gowda");
		service.updateStudent(student);
		service.deleteStudent(student);
		//System.out.println("updates students details:"+service.getStudent(1234567890l));
		

	}

}
