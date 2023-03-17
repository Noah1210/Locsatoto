package com.pardon.locsatoto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pardon.locsatoto.sevices.ILocationService;


@Controller
public class LocationsController {
	@Autowired ILocationService LocationService;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("locations", LocationService.locsEnCour());
		return "index";
	}
	
	@GetMapping("/entree")
	public String woo(Model model) {
		return "entree";
	}

}
