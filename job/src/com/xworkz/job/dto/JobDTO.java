package com.xworkz.job.dto;

import java.io.Serializable;

import com.xworkz.job.constant.DesignationProperties;
import com.xworkz.job.constant.QualificationProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class JobDTO implements Serializable {
	
	private Integer id;
	private DesignationProperties designation=DesignationProperties.DEFAULT;
    private Double salaryPackage;
	private QualificationProperties qualification=QualificationProperties.DEFAULT;
	private Double percentage;
	private String fresher;
	
	
	
}
