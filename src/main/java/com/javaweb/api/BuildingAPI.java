package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingDTO;
import com.javaweb.service.Buildingservice;
@RestController   
public class BuildingAPI {	
	@Autowired
	private Buildingservice buildingservice;
	
	@GetMapping(value="/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam (name="name") String name1){
		List<BuildingDTO> result=buildingservice.findall(name1);
		return result;
	}

//	public void valiDate(BuildingDTO buildingDTO){
//	if(buildingDTO.getName()==null || buildingDTO.getName().equals("")||buildingDTO.getNumberOfbasement()==null) {
//		throw new FieldRequiredException("name or numberofbasement is null");
//	}
//}
}
