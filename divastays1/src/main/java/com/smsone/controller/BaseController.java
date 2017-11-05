
package com.smsone.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BaseController {
	//show home
	@RequestMapping(value = "/showHome")
	public String showHome()
	{
		return "home";
	}
	@RequestMapping(value = "/showHome1")
	public String showHome1(@RequestParam("invalid") Long invalid,Model model)
	{
		model.addAttribute("invalid", invalid);
		model.addAttribute("LoginMsg","Please enter valid email and password");
		return "home";
	}
	//show short term
	@RequestMapping(value = "/showShortTerm")
	public String showShortTerm()
	{
		return "shortTerm";
	}
	@RequestMapping(value = "/showShortTerm1")
	public String showShortTerm1(@RequestParam("invalid") Long invalid,Model model)
	{
		model.addAttribute("invalid", invalid);
		return "shortTerm";
	}
	//show long term
	@RequestMapping(value = "/showLongTerm")
	public String showLongTerm()
	{
		return "longTerm";
	}
	@RequestMapping(value = "/showLongTerm1")
	public String showLongTerm1(@RequestParam("invalid") Long invalid,Model model)
	{
		model.addAttribute("invalid", invalid);
		return "longTerm";
	}
	//show help page
	@RequestMapping(value = "/showHelp")
	public String showHelp()
	{
		return "help";
	}
	//show HouseInfo help
	@RequestMapping(value = "/showHouseInfo/showHelp")
	public String showHelp1()
	{
		return "redirect:/showHelp";
	}
	//show HouseInfo Terms and condition page
	@RequestMapping(value = "/showHouseInfo/showTermsAndCondition")
	public String showTermsAndCondition1()
	{
		return "redirect:/showTermsAndCondition";
	}
	//show  Terms and condition page
	@RequestMapping(value = "/showTermsAndCondition")
	public String showTermsAndCondition()
	{
		return "termsAndCondition";
	}
	//show know more page
	@RequestMapping(value = "/showKnowMore")
	public String showKnowMore()
	{
		return "knowMore";
	}
	//show HouseInfo know more page
	@RequestMapping(value = "/showHouseInfo/showKnowMore")
	public String showKnowMore1()
	{
		return "redirect:/showKnowMore";
	}
	//show deal1 page
	@RequestMapping(value = "/showDeal1")
	public String showDeal1()
	{
		return "deal1";
	}
	
	
	@RequestMapping(value = "/checkdate")
	public String checkdate(@RequestParam("date")@DateTimeFormat(pattern="yyyy-MM-dd") Date date)
	{
				
		return "deal1";
	}
}
