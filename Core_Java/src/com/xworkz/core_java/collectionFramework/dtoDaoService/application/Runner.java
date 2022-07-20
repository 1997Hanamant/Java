package com.xworkz.core_java.collectionFramework.dtoDaoService.application;

import com.xworkz.core_java.collectionFramework.dtoDaoService.dto.BikeDto;
import com.xworkz.core_java.collectionFramework.dtoDaoService.service.BikeService;
import com.xworkz.core_java.collectionFramework.dtoDaoService.service.BikeServiceImpl;

public class Runner {
	public static void main(String[] args) {
		BikeDto apache=new BikeDto();
		apache.setBrand("Apache");
		apache.setColor("blue");
		apache.setPrice(120000.00);
		apache.setNoOfGear(5);

		BikeDto yamaha=new BikeDto();
		yamaha.setBrand("Yamaha");
		yamaha.setColor("black");
		yamaha.setPrice(140000.00);
		yamaha.setNoOfGear(5);

		BikeService service=new BikeServiceImpl();
		service.save(apache);
		service.save(yamaha);
		service.updateBrandByPrice("T v s",120000.00 );
		service.deleteBrandByPrice("Apache",120000.00 );
		BikeDto bike =service.getBike(140000.00);
		System.out.println( bike);
	}
}
