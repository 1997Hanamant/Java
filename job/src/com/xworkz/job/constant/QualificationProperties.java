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
	public static QualificationProperties getByValue(String value) {
		QualificationProperties[] qualificationProperties=QualificationProperties.values();
		for(QualificationProperties qualificationProperties2:qualificationProperties) {
			System.out.println(qualificationProperties2.qualification+"Comparing");
			if(qualificationProperties2.qualification.equals(value));
			return qualificationProperties2;
			
			
		}
		return null;
		
	}
	}


