package com.xworkz.job.constant;

public enum MySqlProperties {
	URL("jdbc:mysql://localhost:3306/job"),USERNAME("root"),SECRET("Hanamant123@");
	
	private String value;
	
	private MySqlProperties(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
