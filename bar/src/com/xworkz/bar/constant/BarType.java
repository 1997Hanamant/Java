package com.xworkz.bar.constant;

public enum BarType {
	WINE_STORE("wine strore"),
	MSIL("misl"),
	BAR_RESTURNT("bar resturnt"),
	RESORT("resort"), 
	DEFALUT("resturnt");

	private String name;

	private BarType(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

}
