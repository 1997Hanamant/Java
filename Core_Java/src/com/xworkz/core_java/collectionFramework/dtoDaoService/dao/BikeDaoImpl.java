package com.xworkz.core_java.collectionFramework.dtoDaoService.dao;

import java.util.ArrayList;

import com.xworkz.core_java.collectionFramework.dtoDaoService.dto.BikeDto;

public class BikeDaoImpl implements BikeDao {
	ArrayList<BikeDto>bikes=new ArrayList<BikeDto>();

	@Override
	public void save(BikeDto dto) {
		bikes.add(dto);
		System.out.println("Added bike is:"+dto);
	}
	@Override
	public BikeDto getBike(double price) {
		for(int i=0;i<bikes.size();i++) {
			if(bikes.get(i).getPrice()==price) {
				return bikes.get(i);
			}
		}
		return null;
	}
	@Override
	public void updateBrandByPrice(String brandToUpdate, double price) {
		for (int i = 0; i <bikes.size(); i++) {
			BikeDto dto =bikes.get(i);
			if (dto.getPrice()==price) {
				dto.setBrand(brandToUpdate);
			System.out.println("Updated name is  " +dto.getBrand()  + " "  +bikes.get(i));
			break;
	}
	}
	}
	@Override
	public void deleteBrandByPrice(String brandToDelete, double price) {
		for (int i = 0; i <bikes.size(); i++) {
			BikeDto dto =bikes.get(i);
			if (dto.getPrice()==price) {
				dto.setBrand(brandToDelete);
			bikes.remove(i);
			System.out.println("Delete brand is  " +dto.getBrand()  + " " +"from arraylist");
			break;
	
		}

		}
	}
}