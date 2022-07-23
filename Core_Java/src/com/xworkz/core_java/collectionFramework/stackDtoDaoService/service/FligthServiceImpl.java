package com.xworkz.core_java.collectionFramework.stackDtoDaoService.service;

import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dao.FlightDao;
import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dao.FlightDaoImpl;
import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dto.FligthDto;

public class FligthServiceImpl implements FligthService{
	private	FlightDao dao=new FlightDaoImpl();


	@Override
	public void save(FligthDto dto) {
		if(dto!=null) {
			double price=dto.getPrice();
			if(price>5000.00) {
				this.dao.save(dto);
				
			}
		}
	}

	@Override
	public FligthDto getFligth(double price) {it}

	@Override
	public void updateTypeByPrice(String typeToUpdate, double price) {
		if(typeToUpdate!=null && typeToUpdate.length()>3 && typeToUpdate.length()<30 ) {
			this.dao.updateTypeByPrice(typeToUpdate, price);
		}
		else {
			System.out.println("Entered updated type is Invlaid");
		}

	}
	@Override
	public void updateDestinationByPrice(String destinationToUpdate, double price) {
		if(destinationToUpdate!=null && destinationToUpdate.length()>3 && destinationToUpdate.length()<30 ) {
			this.dao.updateDestinationByPrice(destinationToUpdate, price);
		}
		else {
			System.out.println("Entered updated type is Invlaid");
		}

	}

	@Override
	public void deleteTypeByPrice(String typeToDelete, double price) {
		if(typeToDelete!=null && typeToDelete.length()>3 && typeToDelete.length()<30 ) {
			this.dao.deleteTypeByPrice(typeToDelete, price);
		}
		else {
			System.out.println("Entered Deleted type is Invalid");
		}

	}


}
