package com.infy.provisioning.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository("inAppProvDataDaoImpl")
public class InAppProvDataDaoImpl implements InAppProvDataDao{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String showMesaageFromDao() {
		// TODO Auto-generated method stub
		String daoImplString=daoString+" \n Above line is retruned from Dao Implementation Class";
		
		return daoImplString;
	}

	/**
	 * Reference Site
	 * 
	 * https://howtodoinjava.com/spring-restful/spring-restful-client-resttemplate-example/ 
	 */
	@Override
	public String semantic_hub_details() {
		// TODO Auto-generated method stub
		final String uri = "http://localhost:9000/semantic_hub_details";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
	    System.out.println(result);
	    return result;
	}
	
	public String anotherServiceResult() {
		return semantic_hub_details();
	}

}
