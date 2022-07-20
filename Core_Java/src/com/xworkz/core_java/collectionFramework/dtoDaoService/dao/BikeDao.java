package com.xworkz.core_java.collectionFramework.dtoDaoService.dao;

import com.xworkz.core_java.collectionFramework.dtoDaoService.dto.BikeDto;

public interface BikeDao {
	public void save(BikeDto dto);
	BikeDto getBike(double price);
	public void updateBrandByPrice(String brandToUpdate,double price);
	public void deleteBrandByPrice(String brandToDelete,double price);

}
