package com.infy.provisioning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.infy.provisioning.entity.Card;
import com.infy.provisioning.service.*;

@Controller
public class InAppProvDataController {

	@Autowired
	
	private InAppProvDataService inAppProvDataServiceImple;

	public void setInAppProvDataServiceImple(InAppProvDataService inAppProvDataServiceImple) {
		this.inAppProvDataServiceImple = inAppProvDataServiceImple;
	}

	@RequestMapping(value = "/InAppProvisionData", method = RequestMethod.GET)
	public String inAppProvisionDataHandler(Model map) {
		String info="This below data is showing through controller.\n";
		String service_response=inAppProvDataServiceImple.showMessageFromServie();
		String output_msg=info.concat("\n "+service_response);
		map.addAttribute("provData", output_msg);
		return "inAppProvisionData";
	}
	
	@RequestMapping(value ="/provRegistration",method = RequestMethod.POST) 
//	@ResponseBody// it only support port method
    public String saveDetails(@RequestParam("uuid") String uuid,
                              @RequestParam("fpan") String fpan,
                              @RequestParam("expDate") String expDate,
                              Model modelMap) {
        // write your code to save details
		System.out.println("In SaveDetials method --> InApproveDataController : Start");
        modelMap.addAttribute("uuid", uuid);
        modelMap.addAttribute("fpan", fpan);
        modelMap.addAttribute("expDate", expDate);
        System.out.println(uuid+ " : "+fpan+" : "+expDate);
        
        String sem_hun_Serv_Resp=inAppProvDataServiceImple.anotherServiceResult();
        modelMap.addAttribute("FromSemanticHub", sem_hun_Serv_Resp);
        System.out.println("In SaveDetials method --> InApproveDataController : ENd");
        return "provRegSuccessPage";           // welcome is view name. It will call welcome.jsp
    }
	
	
}
