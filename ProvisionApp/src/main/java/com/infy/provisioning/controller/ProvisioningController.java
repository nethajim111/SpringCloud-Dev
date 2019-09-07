package com.infy.provisioning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProvisioningController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showIndex(Model map) {
		map.addAttribute("message", "In App Provisioning");
		return "index";
	}
	
	@RequestMapping(value = "/HomePage", method = RequestMethod.GET)
	public String showHomePage(Model map) {
		map.addAttribute("message", "Dear User Welcome To My Home Page");
		return "homePage";
	}
}
