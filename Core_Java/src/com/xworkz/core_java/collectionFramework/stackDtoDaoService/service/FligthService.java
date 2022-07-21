package com.xworkz.core_java.collectionFramework.stackDtoDaoService.service;

import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dto.FligthDto;

public interface FligthService {
	public void save(FligthDto dto);
	FligthDto getFligth(double price);
	public void updateTypeByPrice(String typeToUpdate,double price);
	public void updateDestinationByPrice(String destinationToUpdate,double price);
	public void deleteTypeByPrice(String typeToDelete,double price);
	

}
