package lipstick;

public enum DBLipstickProperties {
	URL("jdbc:mysql://localhost:3306/lipstick"),USERNME("root"),PASSWORD("Hanamant123@");
	private String value;
	
 private DBLipstickProperties(String value) {
		this.value=value;
		
	}
	public String getValue() {
		return value;
	}
	

}
