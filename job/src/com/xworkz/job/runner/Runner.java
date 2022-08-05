
package com.xworkz.job.runner;

import com.xworkz.job.constant.DesignationProperties;
import com.xworkz.job.constant.QualificationProperties;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class Runner {
	public static void main(String[] args) {
		JobDTO dto = new JobDTO(1, DesignationProperties.SOFTWARE_DEVELOPER_ENGINEER, 500000.00D,
				QualificationProperties.BSC, 55.00, "YES");
		JobDAO dao = new JobDAOImpl();
		// dao.save(dto);
		JobDTO id = dao.findById(3);
		System.out.println(id);
		System.out.println("**********************");
		JobDTO idDesignatiom = dao.findByIdAndDesignation(3, "SoftWare Developer Enginner");
		System.out.println(idDesignatiom);
		System.out.println("**********************");
		JobDTO idDesignationQualification = dao.findByIdAndDesignationAndQualification(3, "SoftWare Developer Enginner",
				"BSC");
		System.out.println(idDesignationQualification);
		dao.getTotal();
		System.out.println("**********************");
		Boolean fresher =dao.isFresherById(3);
		System.out.println(fresher);
		System.out.println("**********************");
		Double percentage	=dao.getMaxPercenatge();
		System.out.println(percentage);

	}

}
