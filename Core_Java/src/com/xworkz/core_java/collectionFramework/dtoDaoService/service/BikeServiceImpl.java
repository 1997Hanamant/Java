package com.xworkz.core_java.collectionFramework.dtoDaoService.service;

import com.xworkz.core_java.collectionFramework.dtoDaoService.dao.BikeDao;
import com.xworkz.core_java.collectionFramework.dtoDaoService.dao.BikeDaoImpl;
import com.xworkz.core_java.collectionFramework.dtoDaoService.dto.BikeDto;

public class BikeServiceImpl implements BikeService{
	private BikeDao dao=new BikeDaoImpl();

	public void save(BikeDto dto) {
		if(dto!=null) {
		double price=dto.getPrice();
		if(price>100000.00) {
			this.dao.save(dto);
		}
		else {
			System.out.println("Entered price is invlaid");
		}
			
		}
			
	}
	public BikeDto getBike(double price) {
		return dao.getBike(price);
	}

	@Override
	public void updateBrandByPrice(String brandToUpdate, double price) {
	if(brandToUpdate!=null && brandToUpdate.length()>3 && brandToUpdate.length()<30) {
       this.dao.updateBrandByPrice(brandToUpdate, price);
	}
	else {
		System.out.println("Entered updated brand is invalid");
	}
	}
     @Override
	public void deleteBrandByPrice(String brandToDelete, double price) {
  if(brandToDelete!=null && brandToDelete.length()>3 && brandToDelete.length()<30 ) {
    this.dao.deleteBrandByPrice(brandToDelete, price);
  }
  else {
	  System.out.println("Entered brand is invalid");
  }
	}
     }





