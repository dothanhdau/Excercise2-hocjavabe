package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.Buildingservice;
@Service
public class Buildingserviceimpl implements Buildingservice {
	@Autowired
	private BuildingRepository buidlingrepository;
	@Override
	public List<BuildingDTO> findall(String name) {
		List<BuildingEntity> building=buidlingrepository.findall(name);
		List<BuildingDTO> result=new ArrayList<>();
		for(BuildingEntity item : building) {
			BuildingDTO a=new BuildingDTO();
			a.setAddress(item.getStreet()+" "+item.getWard());
			a.setName(item.getName());
			a.setNumberOfbasement(item.getNumberOfbasement());
			result.add(a);
		}
		return result;
	}
	
	
}
