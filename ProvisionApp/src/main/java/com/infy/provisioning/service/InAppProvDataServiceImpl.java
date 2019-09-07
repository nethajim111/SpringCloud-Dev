package com.infy.provisioning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.provisioning.dao.InAppProvDataDao;

@Service("inAppProvDataServiceImple")
public class InAppProvDataServiceImpl implements InAppProvDataService {

	@Autowired
	private InAppProvDataDao inAppProvDataDaoImpl;

	public void setInAppProvDataDaoImpl(InAppProvDataDao inAppProvDataDaoImpl) {
		this.inAppProvDataDaoImpl = inAppProvDataDaoImpl;
	}

	@Override
	public String showMessageFromServie() {
		// TODO Auto-generated method stub
		String daoReponse=inAppProvDataDaoImpl.showMesaageFromDao();
		StringBuffer sb=new StringBuffer();
		sb.append("<html><br>"+daoReponse +" \' Time is \' : "+ serviceDate);
		sb.append("<br>Date is appeded to daoResponse in Service Implementation Class.<br>That date is declared in Service Interface</html>");
		return sb.toString();
	}

	@Override
	public String anotherServiceResult() {
		// TODO Auto-generated method stub
		String response = inAppProvDataDaoImpl.anotherServiceResult();
		return response;
	}

}
