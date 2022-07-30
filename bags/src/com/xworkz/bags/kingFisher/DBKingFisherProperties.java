package com.xworkz.bags.kingFisher;

public enum DBKingFisherProperties {
	URL("jdbc:mysql://localhost:3306/kingfisher"),USERNME("root"),PASSWORD("Hanamant123@");
	private String value;
	
	private  DBKingFisherProperties(String value) {
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}
}

