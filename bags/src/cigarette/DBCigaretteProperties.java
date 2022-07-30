package cigarette;

public enum DBCigaretteProperties {
	URL("jdbc:mysql://localhost:3306/cigarette"),USERNME("root"),PASSWORD("Hanamant123@");
	private String value;
	
	private DBCigaretteProperties(String value) {
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}

}
