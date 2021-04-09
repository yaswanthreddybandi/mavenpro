package com.infosys.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Additione {
	@GetMapping("Addee")
	public Integer Addee(Integer v1 , Integer v2) {
		
		int c = v1+ v2;
		
		return c;
		
	}
	
	@GetMapping("Multi/{v1}/{v2}")
	public Integer Multi(@PathVariable Integer v1 , @PathVariable Integer v2) {
		
		Integer c = v1*v2;
		
		return c;
		
	}

}
