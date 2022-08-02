package com.xworkz.job.runner;

import com.xworkz.job.constant.DesignationProperties;
import com.xworkz.job.constant.QualificationProperties;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class Runner {
	public static void main(String[] args) {
		JobDTO dto = new JobDTO(3, DesignationProperties.SOFTWARE_DEVELOPER_ENGINEER, 500000.00D,
				QualificationProperties.BSC, 55.00, "YES");
		JobDAO dao = new JobDAOImpl();
		// dao.save(dto);
		dao.findById(2);
	}

}
