package com.xworkz.job.constant;

public enum DesignationProperties {
	
SYSTEM_ENGINEER("System Engineer"),
TECHNICAL_SUPPORT_ENGINEER("Technical Support Engineer"),
NETWORK_ENGINEER("Network Engineer"),
SOFTWARE_TESTING_ENGINEER("Software Testing Engineer"),
SOFTWARE_DEVELOPER_ENGINEER("SoftWare Developer Enginner"),
	DEFAULT("NA");
	
	private String designation;
	
	private DesignationProperties( String designation) {
	this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
		
	}



