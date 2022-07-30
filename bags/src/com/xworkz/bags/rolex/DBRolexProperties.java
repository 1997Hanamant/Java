package com.xworkz.bags.rolex;

public enum DBRolexProperties {
	URL("jdbc:mysql://localhost:3306/rolex"),USERNME("root"),PASSWORD("Hanamant123@");
	private String value;
	
 private DBRolexProperties(String value) {
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}

}
