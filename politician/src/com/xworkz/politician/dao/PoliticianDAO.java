package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {
	boolean save(PoliticianDTO dto);
	PoliticianDTO findById(int id);
	PoliticianDTO findBYIdAndPresident(int id ,String president);
	PoliticianDTO findBYIdAndPresidentAndName(int id ,String president,String name );
	PoliticianDTO findBYIdAndName(int id ,String name);
	String findNameById(int id);
	String findPresidentByIdAndName(int id,String name);
	int getTotal();
	PoliticianDTO findPartyByMaxMembers();
	
	

}
