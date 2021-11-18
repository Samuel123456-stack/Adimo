package com.konex.adimo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.konex.adimo.Entidades.Proprietario;
import com.konex.adimo.Repositorios.ProprietarioRepositorio;

@Controller
public class ProprietarioController {
	
	@Autowired
	private ProprietarioRepositorio proRepo;
	
	@GetMapping("/proprietario/trocaValor")
	public String cadastroProp(@ModelAttribute("prop")Proprietario prop, Model model) {
		
		return "";
		
	}
	
	
	

}
