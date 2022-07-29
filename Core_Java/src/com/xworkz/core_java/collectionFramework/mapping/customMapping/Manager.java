package com.xworkz.core_java.collectionFramework.mapping.customMapping;

public class Manager {
private	String mId;
private	String name;
private	String company;
public String getmId() {
	return mId;
}
public void setmId(String mId) {
	this.mId = mId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "Manager [mId=" + mId + ", name=" + name + ", company=" + company + "]";
}


}
