package com.xworkz.job.constant;

public enum QualificationProperties {
	BE("BE"),BCA("BCA"),BCOM("BCOM"),BSC("BSC"),DEFAULT("NA");
	
	private String qualification;
	
	private QualificationProperties(String qualification) {
		this.qualification=qualification;

	}
	public String getQualification() {
		return qualification;
	}
	}


