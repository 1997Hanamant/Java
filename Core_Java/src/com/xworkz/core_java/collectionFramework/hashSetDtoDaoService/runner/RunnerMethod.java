package com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.runner;

import com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.dao.TrainDao;
import com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.dao.TrainDaoImpl;
import com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.dto.TrainDto;
import com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.service.TrainService;
import com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.service.TrainServiceImpl;

public class RunnerMethod {
	public static void main(String[] args) {
		TrainDto channamma=new TrainDto();
		channamma.setName("Rani Channamma");
		channamma.setSource("Hubli");
		channamma.setDestination("Benglore");
		channamma.setTrainNumber(013456);
		channamma.setTime("8:10:00 AM");
		
		TrainDto hampi=new TrainDto();
		hampi.setName("Hampi Express");
		hampi.setSource("VijayPur");
		hampi.setDestination("Hubli");
		hampi.setTrainNumber(013431);
		hampi.setTime("6:10:00 PM");
		
		TrainDao dao=new TrainDaoImpl();
		TrainService service=new TrainServiceImpl();
		service.save(channamma);
		service.save(hampi);
		service.updateNameByTime("Rajadani Express","8:10:00 AM");
		service.deleteSourceByTime("VijayPur","6:10:00 PM");
        TrainDto train =service.getTrain("Benglore");
        System.out.println(train);
		
	}

}
