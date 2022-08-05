package com.xworkz.politician.dto;

import java.io.Serializable;

import com.xwrokz.politician.constant.PartyNameProperties;
import com.xwrokz.politician.constant.PartySymbolProperties;
import com.xwrokz.politician.constant.PresidentProperties;

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

public class PoliticianDTO  implements Serializable{
	private Integer pId;
	private   String name;
	private PartyNameProperties partyname=PartyNameProperties.AAP;
	private PresidentProperties president=PresidentProperties.ARVINDKEJRIWAL;
	private Integer totalMember;
	private Double totalBudget;
	private PartySymbolProperties partySymbol=PartySymbolProperties.BROOM;
	private String location;
	private String headQuater;
	

}
