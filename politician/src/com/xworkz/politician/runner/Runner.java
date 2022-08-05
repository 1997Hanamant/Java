package com.xworkz.politician.runner;

import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;
import com.xworkz.politician.dto.PoliticianDTO;
import com.xwrokz.politician.constant.PartyNameProperties;
import com.xwrokz.politician.constant.PartySymbolProperties;
import com.xwrokz.politician.constant.PresidentProperties;

public class Runner {

	public static void main(String[] args) {
		PoliticianDTO dto = new PoliticianDTO(1, "Kalyan", PartyNameProperties.AAP, PresidentProperties.ARVINDKEJRIWAL,
				100, 20000000.00D, PartySymbolProperties.BROOM, "Dehli", "Dehli");
		PoliticianDAO dao = new PoliticianDAOImpl();
		//dao.save(dto);
		PoliticianDTO dto1 = new PoliticianDTO(2, "Shankar", PartyNameProperties.BJP, PresidentProperties.JPNADDA,
				200, 40000000.00D, PartySymbolProperties.LOTUS, "Dehli", "Dehli");
		//dao.save(dto1);

		PoliticianDTO dto2 = new PoliticianDTO(3, "Sunil", PartyNameProperties.AAP, PresidentProperties.RSKUSHWAHA,
				80, 4000000.00D, PartySymbolProperties.ELEPHANT, "Dehli", "Dehli");
		//dao.save(dto2);

		PoliticianDTO dto3 = new PoliticianDTO(4, "Sharat", PartyNameProperties.AITC, PresidentProperties.SUBRATABAKSHI,
				60, 35000000.00D, PartySymbolProperties.TWOFLOWERSWITHGRASS, "Delhi", "Delhi");
		//dao.save(dto3);

		PoliticianDTO dto4 = new PoliticianDTO(5, "Nandesh", PartyNameProperties.CPI, PresidentProperties.DRAJA,
				50, 20000000.00D, PartySymbolProperties.EAROFCORNSICKLE, "Mumbai", "Mumbai");
		//dao.save(dto4);

		PoliticianDTO dto5 = new PoliticianDTO(6, "Arjun", PartyNameProperties.INC, PresidentProperties.SONIAGANDHI,
				180, 50000000.00D, PartySymbolProperties.HAND, "Delhi", "Delhi");
		//dao.save(dto5);

		PoliticianDTO dto6 = new PoliticianDTO(7, "Raghu", PartyNameProperties.NCP, PresidentProperties.SHARADPAWAR,
				120, 60000000.00D, PartySymbolProperties.CLOCK, "Mumbai", "Mumbai");
		//dao.save(dto6);

		PoliticianDTO dto7 = new PoliticianDTO(8, "Chandru", PartyNameProperties.NPP, PresidentProperties.NANAAKUFOADDO,
				200, 40000000.00D, PartySymbolProperties.BOOK, "Mumbai", "Mumbai");
		//dao.save(dto7);

		PoliticianDTO dto8 = new PoliticianDTO(9, "Sachin", PartyNameProperties.PK, PresidentProperties.UPENDRA,
				30, 2000000.00D, PartySymbolProperties.AUTO, "Bengaluru", "Bengaluru");
		//dao.save(dto8);

		PoliticianDTO dto9 = new PoliticianDTO(10, "Swati", PartyNameProperties.JDS, PresidentProperties.DEVEGOWDA,
				90, 350000000.00D, PartySymbolProperties.LADYFROMER, "Mandya", "Mandya");
		//dao.save(dto9);

		PoliticianDTO id=dao.findById(1);
		System.out.println(id);
		System.out.println("***********************************");

		PoliticianDTO idAndPresident=dao.findBYIdAndPresident(5, "D Raja");
		System.out.println(idAndPresident);

		System.out.println("***********************************");

		PoliticianDTO idAndPresidentAndName=dao.findBYIdAndPresidentAndName(3, "R S Kushwaha", "Sunil");
		System.out.println(idAndPresidentAndName);

		System.out.println("***********************************");
		PoliticianDTO idAndName	=dao.findBYIdAndName(8, "Chandru");
		System.out.println(idAndName);

		System.out.println("***********************************");
		String name	=dao.findNameById(1);
		System.out.println(name);

		System.out.println("***********************************");
		String president=dao.findPresidentByIdAndName(1, "Kalyan");
		System.out.println(president);

		System.out.println("***********************************");
		dao.getTotal();

		System.out.println("***********************************");
		PoliticianDTO max=dao.findPartyByMaxMembers();
		System.out.println(max);



	}


}
