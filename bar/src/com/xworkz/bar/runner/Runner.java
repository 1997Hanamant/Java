package com.xworkz.bar.runner;

import com.xworkz.bar.constant.BarType;
import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;


public class Runner {
	public static void main(String[] args) {
		BarDTO dto=new BarDTO(2, "shilpaSister", "BTM1StStage", BarType.RESORT, "20000","600000" );
		BarDAO dao=new BarDAOImpl();
				dao.save(dto);
		
	}

}