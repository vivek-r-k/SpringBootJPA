package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
//	@RequestMapping("addAlien")
//	public Alien addAlien(Alien alien) {
//	System.out.println("Received Alien: " + alien.getId() + ", " + alien.getAname());
//		repo.save(alien);
//		return alien;
//	}
	
	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, @RequestParam("atech") String atech) {
	    Alien alien = new Alien();
	    alien.setId(aid);
	    alien.setAname(aname);
	    alien.setAtech(atech);
	    repo.save(alien);
	    return "home.jsp";
	}
	
	@RequestMapping("updateAlien")
	public String updateAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, @RequestParam("atech") String atech) {
	    Alien alien = new Alien();
	    alien.setId(aid);
	    alien.setAname(aname);
	    alien.setAtech(atech);
	    repo.save(alien);
	    return "home.jsp";
	}

	@RequestMapping("getAlien") 
	public ModelAndView getAlien(@RequestParam int aid) {
	    ModelAndView mv = new ModelAndView("showAlien.jsp");
	    Alien alien = repo.findById(aid).orElse(new Alien());
	    
	    mv.addObject(alien);
	    
	    return mv;
	}
//	TODO: findByTech and other written methods
//	TODO: update and delete by id
	
//	produces is used to mention in which format the data to be sent
	@RequestMapping(path="/getAliens",produces= {"application/xml"})
	@ResponseBody //this is for displaying data when view name is not mentioned
//	if we don't want to use @ResponseBody every time, we can replace @Controller by @RestController
	public List<Alien> getAliens() {
		return (List<Alien>) repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody //this is for displaying data when view name is not mentioned
	public Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		
		repo.delete(a);
		return "Deleted"; //for now it won't be displayed as a page, cze there is no particular page written
	}
	
	
}
