package com.xworkz.bags;

public enum DBBagproperties {
	URL("jdbc:mysql://localhost:3306/perfume"),USERNAME("root"),PASSWORD("Hanamant123@");
	
	private String value;
	
	private DBBagproperties(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	

}
