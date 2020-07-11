package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Dao;
import com.example.demo.model.Complain;
import com.example.demo.model.Date;
import com.example.demo.model.Holiday;
import com.example.demo.model.MyModel;




@Controller
public class MyController {
	
	
	@Autowired
	private Dao dao;
	
	@GetMapping("/")
	public String Home() {
		return "redirect:/index";
	}
	@GetMapping("/index")
	public String Homepage() {
		return "index";
	}
	@GetMapping("/left-sidebar")
	public String Employeelog() {
		return "left-sidebar";
	}
	@GetMapping("/adminlogin")
	public String Adminlog() {
		return "adminlogin";
	}
	@GetMapping("/no-sidebar")
	public String about() {
		return "no-sidebar";
	}
	@GetMapping("/contactus")
	public String Contactus() {
		return "contactus";
	}
	@GetMapping("/empinside")
	public String empDashboard() {
		return "empinside";
	}
	@GetMapping("/forgot")
	public String forgot() {
		return "forgot";
	}
	@GetMapping("/reset")
	public String reset() {
		return "reset";
	}
	@GetMapping("/salarystatus")
	public String salstatus() {
		return "salarystatus";
	}
	@GetMapping("admininside")
	public String admininside()
	{
		return "admininside";
	}
	
	
	
	
				
	
	@GetMapping("/singup")
	public String s1(Model model)
	{
		MyModel mymodel = new MyModel();
		model.addAttribute("mymodel", mymodel);
		return "singup";
	}
	
	@PostMapping("/singupsave")
	public String singuppage(@ModelAttribute("mymodel") MyModel mymodel) {
		dao.save(mymodel);
		return "left-sidebar";
		
	}
	
	
	@GetMapping("/markattendence")
	public String markattendence(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "markattendence";
	}
	
	@PostMapping("/empinsidee")
	public String markedatt(@ModelAttribute("date") Date date) {
		dao.save1(date);
		return "empinside";
	}
	
	@GetMapping("/viewattendence")
	public String viewattendence(Model model) {
		List<Date> listDate = dao.listAll();
		model.addAttribute("listDate", listDate);
		return "viewattendence";
	}
	
	@GetMapping("/editemp")
	public String editemp(Model model) {
		List<MyModel> listmymodel = dao.listAll1();
		model.addAttribute("listmymodel", listmymodel);
		return "editemp";
	}
	
	
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable(name="id") int id) {
		ModelAndView mav = new ModelAndView("edit");
		MyModel mymodel = dao.get(id);
		mav.addObject("mymodel",mymodel);
		return mav;
	}
	
	
	@GetMapping("/complain")
	public String complain(Model model) {
		Complain complain = new Complain();
		model.addAttribute("complain", complain);
		return "complain";
	}
	@PostMapping("/complainsave")
	public String complainsave(@ModelAttribute("complain") Complain complain) {
		dao.save(complain);
		return "empinside";
		
	}

	@GetMapping("/vacation")
	public String leavepage(Model model)
	{
		Holiday holiday = new Holiday();
		model.addAttribute("holiday", holiday);
		return "vacation";
	}
	@PostMapping("/vacationsave")
	public String leavesave(@ModelAttribute("holiday") Holiday holiday)
	{
		dao.save4(holiday);
		return "empinside";
	}
//	@PostMapping("/saveleave")
//	public String saveeditleave(@ModelAttribute("holiday")Holiday holiday){
//		dao.save4(holiday);
//		return "editleave";
//	}
//	
	@PostMapping("/editsave")
	public String editsave(@ModelAttribute("mymodel") MyModel mymodel) {
		dao.save(mymodel);
		return "redirect:/editemp";
	}
	@GetMapping("/editleave")
	public String editleave(Model model) {
		List<Holiday> listholiday = dao.listAll4();
		model.addAttribute("listholiday", listholiday);
		return "editleave";
	}
	@GetMapping("/editcomplain")
	public String editcomplain(Model model) {
		List<Complain> listcomplain = dao.listAll3();
		model.addAttribute("listcomplain", listcomplain);
		return "editcomplain";
	}
	
	@GetMapping("/respondholiday/{id}")
	public ModelAndView respondholiday(@PathVariable("id") int id   ) {
		ModelAndView mv = new ModelAndView("respondholiday");
		Complain complain = dao.get3(id);
		mv.addObject("complain", complain);
		return mv;
	}
	@GetMapping("/deleteleave/{id}")
	public String deleteleave(@PathVariable(name ="id") int id)
	{
		dao.delete4(id);
		return "redirect:/editleave";
	}
	
	
	@GetMapping("/deletecomplain/{id}")
	public String deletecomplain(@PathVariable(name = "id") int id)
	{
		dao.delete3(id);
		return "redirect:/editcomplain";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable(name="id") int id)
	{
		dao.delete(id);
		return "redirect:/editemp";
	}
}

