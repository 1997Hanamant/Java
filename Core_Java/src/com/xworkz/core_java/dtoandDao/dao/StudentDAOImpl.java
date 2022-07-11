
package com.xworkz.core_java.dtoandDao.dao;

import com.xworkz.core_java.dtoandDao.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {
	StudentDTO[] students = new StudentDTO[10];
	int index=0;

	@Override
	public void  addStudent(StudentDTO dto) {
		this.students[this.index] = dto;
		this.index++;
		
		}
	

	@Override
	public StudentDTO getStudent(long phoneNo) {
		for (int i = 0; i < students.length; i++) {
			if(students[i]!=null && students[i].getphoneNo()==phoneNo) {
			//System.out.println(students[i]);
			return students[i];

			}

	}
		return null;
	}


	@Override
	public void updateStudent(StudentDTO dto) {
		int count=0;
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null&& students[i].getphoneNo()==dto.getphoneNo()){
				count++;
				students[i].setid(dto.getid());
				students[i].setbatchname(dto.getbatchname());
				students[i].setname(dto.getname());
				students[i].setpercentage(dto.getpercentage());
				
			}
		}
		if(count==0) {
			System.out.println("Student not found");
		}
		
	}


	@Override
	public void  deletStudent(StudentDTO dto) {
		int count=0;
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null && students[i].getphoneNo()==dto.getphoneNo()) {
			
				for(int j=i;j<students.length-1;j++) {
					students[j]=students[j+1];
					count++;
					
					
				}
				break;
		 		
				}
		}
			if(count>0) {
				System.out.println("Student: phone number:"+dto.getname()+" "+dto.getphoneNo()+" "+"delet student");
			}
			else {
				System.out.println("Invalid");
			}
	
		}

		
	}
	


