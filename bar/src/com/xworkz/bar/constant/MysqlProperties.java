package com.xworkz.bar.constant;

public enum MysqlProperties {
	URL("jdbc:mysql://localhost:3306/pub"),USERNAME("root"),SECRET("Hanamant123@");
	
	 private String value;
	 
	 private MysqlProperties(String value) {
		 this.value=value;
	
	}
	 public String getValue() {
		return value;
	}

}
