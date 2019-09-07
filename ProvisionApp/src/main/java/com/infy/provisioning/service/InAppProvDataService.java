package com.infy.provisioning.service;


import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public interface InAppProvDataService {

	final Date serviceDate=new Date();
	
	public String showMessageFromServie();
	
//	public String sematicHubResponse();

	public String anotherServiceResult();

}
