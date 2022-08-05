package com.xwrokz.politician.constant;

public enum MysqlProperties {
	URL("jdbc:mysql://localhost:3306/ politician"),USERNAME("root"),SECRET("Hanamant123@");
	
	private String value;
	
	private MysqlProperties(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
