package com.xworkz.core_java.collectionFramework.dtoDaoService.service;

import com.xworkz.core_java.collectionFramework.dtoDaoService.dto.BikeDto;
import com.xworkz.core_java.collectionFramework.dtoDaoService.exception.InvalidDataException;
public interface BikeService{
public void save(BikeDto dto);
BikeDto getBike(double price);
public void updateBrandByPrice(String brandToUpdate,double price)  ;
public void deleteBrandByPrice(String brandToDelete,double price);
	
}
	
