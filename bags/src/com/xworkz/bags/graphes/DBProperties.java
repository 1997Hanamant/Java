package com.xworkz.bags.graphes;

public enum DBProperties {
	URL("jdbc:mysql://localhost:3306/perfume") ,USERNAME("root"),PASSWORD("Hanamant123@");
	
	private String value;
	
	private DBProperties(String value) {
		this.value=value;
		
	}

	public String getValue() {
		return value;
	}
}
