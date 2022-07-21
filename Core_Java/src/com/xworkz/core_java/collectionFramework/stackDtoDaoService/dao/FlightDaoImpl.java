package com.xworkz.core_java.collectionFramework.stackDtoDaoService.dao;

import java.util.Vector;

import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dto.FligthDto;


public class FlightDaoImpl implements FlightDao {
	Vector<FligthDto> fligths=new Vector<FligthDto>();
	

	@Override
	public void save(FligthDto dto) {
		fligths.add(dto);
		System.out.println("Added fligth is:"+dto);
		
	}

	@Override
	public FligthDto getFligth(double price) {
		for(int i=0;i<fligths.size();i++) {
			if(fligths.get(i).getPrice()==price) {
				return fligths.get(i);
			}
		}
		
		return null;
	}

	@Override
	public void updateTypeByPrice(String typeToUpdate, double price) {
	for(int i=0;i<fligths.size();i++) {
		FligthDto dto=fligths.get(i);
		if(dto.getPrice()==price) {
			dto.setType(typeToUpdate);
			System.out.println("updated Type is:"+" "+fligths.get(i));	
		}
	}
		
	}
	@Override
	public void updateDestinationByPrice(String destinationToUpdate, double price) {
		for(int i=0;i<fligths.size();i++) {
			FligthDto dto=fligths.get(i);
			if(dto.getPrice()==price) {
				dto.setDestination(destinationToUpdate);
				System.out.println("updated destinationToUpdate is:"+" "+fligths.get(i));

			}
		}
	}

	@Override
	public void deleteTypeByPrice(String typeToDelete, double price) {
	for(int i=0;i<fligths.size();i++) {
		FligthDto dto=fligths.get(i);
			if(dto.getPrice()==price) {
				dto.setType(typeToDelete);
				System.out.println("Deleted Type is :"+typeToDelete);
		}
	}
		
	}
}
