package com.javainuse.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javainuse.model.fundraiser.FundRaiser;

@RestController
public class PromiseController {

	@RequestMapping({ "/hello" })
	public FundRaiser firstPage() {
		FundRaiser fundraiser = new FundRaiser ();
		fundraiser.setUserName("Hello my name is this");
		fundraiser.setCompany("company");
		fundraiser.setDescription("description");
		fundraiser.setMyDonationArray("hello", "inddsex");
		
		return fundraiser;
	}

}