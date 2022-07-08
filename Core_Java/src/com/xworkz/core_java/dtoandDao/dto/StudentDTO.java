package com.xworkz.core_java.dtoandDao.dto;

public class StudentDTO {
	private	String id;
	private	String name;
	private	String batchname;
	private	long phoneNo;
	private	String percentage;

	public StudentDTO(String id,String name,String batchname,long phoneNo,String percentage){
		this.id=id;
		this.name=name;
		this.batchname=batchname;
		this.phoneNo=phoneNo;
		this.percentage=percentage;

	}
	public void setid(String id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setbatchname(String batchname) {
		this.batchname=batchname;
	}
	public void setphoneNo(Long phoneNo) {
		this.phoneNo=phoneNo;
	}
	public void setpercentage(String percentage) {
		this.percentage=percentage;
	}
	public	String getid() {
		return id;
	}
	public	String getname() {
		return name;
	}
	public String getbatchname() {
		return batchname;
	}
	public long getphoneNo() {
		return phoneNo;
	}
	public	String getpercentage() {
		return percentage;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", batchname=" + batchname + ", phoneNo=" + phoneNo
				+ ", percentage=" + percentage + "]";
	}
	

}




