package com.xworkz.politician.dao;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {
	boolean save(PoliticianDTO dto);

	PoliticianDTO findById(int id);

	PoliticianDTO findBYIdAndPresident(int id, String president);

	PoliticianDTO findBYIdAndPresidentAndName(int id, String president, String name);

	PoliticianDTO findBYIdAndName(int id, String name);

	String findNameById(int id);

	String findPresidentByIdAndName(int id, String name);

	int getTotal();

	String findPartyByMaxMembers();

	default void test() {
		System.out.println("default impl of test");
	}

	default List<PoliticianDTO> findAll() {
		return Collections.EMPTY_LIST;
	}
		
      default List<String> findAllPartyName() {
		return null;
	}
      default List<Integer> findAllIds(){
		return null;
    	  
      }
      default List<Object> findAllNoOfMembersAndTotalBudgetAndPartyName(){
		return null;
    	  
      }

}