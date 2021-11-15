package com.konex.adimo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping	
	public String home() {
		return ("home");
	}
	
	@GetMapping("/detalhes")
	public String detail() {
		return ("selection");
	}
}
