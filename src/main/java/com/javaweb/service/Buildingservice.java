package com.javaweb.service;

import java.util.List;

import com.javaweb.model.BuildingDTO;
public interface Buildingservice {
	List<BuildingDTO> findall(String name);
}
