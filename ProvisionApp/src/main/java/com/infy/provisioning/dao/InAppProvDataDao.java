package com.infy.provisioning.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface InAppProvDataDao {

	final String daoString="I am from Dao Interface.";
	
	public String showMesaageFromDao();
	
	public  String semantic_hub_details();

	public String anotherServiceResult();
}
