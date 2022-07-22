package com.xworkz.core_java.collectionFramework.stackDtoDaoService.runner;

import java.util.ArrayList;

import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dao.FlightDao;
import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dao.FlightDaoImpl;
import com.xworkz.core_java.collectionFramework.stackDtoDaoService.dto.FligthDto;
import com.xworkz.core_java.collectionFramework.stackDtoDaoService.service.FligthService;
import com.xworkz.core_java.collectionFramework.stackDtoDaoService.service.FligthServiceImpl;

public class RunnerMethod {
	public static void main(String[] args) {

		ArrayList<String> offers=new ArrayList<String>();
		ArrayList<String> offers1 =new ArrayList<String>();
		offers.add("30% OFF on Domestic Flights");
		offers1.add("15% OFF in International FLights");


		FligthDto indiaGo=new FligthDto();
		indiaGo.setName("IndiaGo");
		indiaGo.setSource("Hubli");
		indiaGo.setDestination("Banglore");
		indiaGo.setPrice(25000.00);
		indiaGo.setType("Domestic");
		indiaGo.setOffers(offers);



		FligthDto spiceJet=new FligthDto();
		spiceJet.setName("SpiceJet");
		spiceJet.setSource("Banglore");
		spiceJet.setDestination("USA");
		spiceJet.setPrice(50000.00);
		spiceJet.setType("International");
		spiceJet.setOffers(offers1);


		FlightDao flightDao=new FlightDaoImpl();
		FligthService service=new FligthServiceImpl();
		service.save(indiaGo);
		service.save(spiceJet);
		service.updateTypeByPrice("International", 25000.00);
		service.deleteTypeByPrice("SpiceJet",50000.00 );
		service.updateDestinationByPrice("China", 25000.00);
		FligthDto fligth=service.getFligth(50000.00);
		System.out.println(fligth);
}

}
