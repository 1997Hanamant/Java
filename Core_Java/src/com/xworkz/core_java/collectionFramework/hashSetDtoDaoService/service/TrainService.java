package com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.service;

import com.xworkz.core_java.collectionFramework.hashSetDtoDaoService.dto.TrainDto;

public interface TrainService {
	public void save(TrainDto dto);
	TrainDto getTrain(String destination );
	public void updateNameByTime(String nameToUpdate,String time);
	public void deleteSourceByTime(String sourceToDelete,String time);

}
