 package com.javaweb.repository.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
@Repository
// phần này để try cập lấy dữ liệu với database
public class BuildingrepositoryImpl implements BuildingRepository {
	
	static final String url = "jdbc:mysql://localhost:3306/estatebasic";
	static final String user = "root";
	static final String pass = "An191106";
	@Override
	public List<BuildingEntity> findall(String name)  {
		String sql="SELECT * FROM building";
		// TODO Auto-generated method stub
		List<BuildingEntity> result=new ArrayList<>();
		try(Connection conn=DriverManager.getConnection(url,user,pass);
			Statement stem=conn.createStatement();
			ResultSet rs = stem.executeQuery(sql);){
			while(rs.next()){
				BuildingEntity building=new BuildingEntity();
				building.setName(rs.getString("name"));
				building.setNumberOfbasement(rs.getInt("numberOfbasement"));
				building.setWard("ward");
				building.setStreet("street");
				result.add(building);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	

}
