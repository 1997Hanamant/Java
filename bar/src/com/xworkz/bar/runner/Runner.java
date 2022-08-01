package com.xworkz.bar.runner;

import com.xworkz.bar.constant.BarType;
import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;


public class Runner {
	public static void main(String[] args) {
		BarDTO dto = new BarDTO(2, "shilpaSister", "BTM1StStage", BarType.RESORT, "20000", "600000");
		BarDAO dao = new BarDAOImpl();
		dao.save(dto);
		BarDTO dto1 = new BarDTO(3, "Raghavenra", "BTM2ndStage", BarType.WINE_STORE, "10000",
				"3000000 ");
		dao.save(dto1);
		BarDTO dto2 = new BarDTO(4, "Suhas", "BTM3rdStage", BarType.WINE_STORE, "300000",
				"9000000");
		dao.save(dto2);

		BarDTO dto3 = new BarDTO(5, "Laxmi", "BTM4rdStage", BarType.BAR_RESTURNT, "20000",
				"8000000");
		dao.save(dto3);
		BarDTO dto4 = new BarDTO(6, "Shankar", "BTM5rdStage", BarType.WINE_STORE, "150000",
				"4500000");
		dao.save(dto4);

		BarDTO dto5 = new BarDTO(7, "Jyoti", "BTM6rdStage", BarType.DEFALUT, "400000",
				"8000000");
		dao.save(dto5);

		BarDTO dto6 = new BarDTO(8, "Prajwal", "BTM7thStage", BarType.WINE_STORE, "50000",
				"3000000");
		dao.save(dto6);

		BarDTO dto7 = new BarDTO(9, "Ravi", "BTM8thStage", BarType.WINE_STORE, "30000",
				"6000000");
		dao.save(dto7);

		BarDTO dto8 = new BarDTO(10, "Honey", "BTM9thStage", BarType.RESORT, "8000",
				"240000");
		dao.save(dto8);

		BarDTO dto9 = new BarDTO(11, "Pavitra", "JP Nagara", BarType.MSIL, "6000",
				"180000");
		dao.save(dto9);

		BarDTO dto10 = new BarDTO(12, "Charana", "Hubli", BarType.WINE_STORE, "5000",
				"450000");
		dao.save(dto10);

		BarDTO dto11 = new BarDTO(13, "Sanju", "Hubli_Navanagr", BarType.RESORT, "7000",
				"210000");
		dao.save(dto11);

		BarDTO dto12 = new BarDTO(14, "Shadow", "Banaglore", BarType.WINE_STORE, "12000",
				"360000");
		dao.save(dto12);

		BarDTO dto13 = new BarDTO(15, "udapi", "Mejestic", BarType.BAR_RESTURNT, "9000",
				"270000");
		dao.save(dto13);

		BarDTO dto14 = new BarDTO(16, "Gokul", "Hubli_VidyaNagar", BarType.DEFALUT, "13000",
				"390000");
		dao.save(dto14);

		BarDTO dto15 = new BarDTO(17, "Saroja", "Hubli_Hosur", BarType.WINE_STORE, "15000",
				"450000");
		dao.save(dto15);

		BarDTO dto16 = new BarDTO(18, "Nirmal", "Hubli_AkashyPark", BarType.MSIL, "14000",
				"420000");
		dao.save(dto16);

		BarDTO dto17 = new BarDTO(19, "Sujata", "RR Nagar", BarType.WINE_STORE, "12000",
				"360000");
		dao.save(dto17);

		BarDTO dto18 = new BarDTO(20, "Naveen", "Bagalkot", BarType.RESORT, "25000",
				"750000");
		dao.save(dto18);

	}

}