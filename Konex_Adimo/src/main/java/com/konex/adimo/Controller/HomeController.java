package com.konex.adimo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.NewsLetter;
import com.konex.adimo.Repositorios.CidadeRepositorio;
import com.konex.adimo.Repositorios.ImovelRepositorio;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private CidadeRepositorio cidRepo;
	
	@Autowired
	private ImovelRepositorio imoRepo;
	
	@GetMapping	
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");	
		mv.addObject("cidade", cidRepo.findAll());
		mv.addObject("imovel", imoRepo.findAll());
		mv.addObject("news", new NewsLetter());
		return mv;
	}
	
	@GetMapping("/home/busca")
	public ModelAndView busca(@RequestParam(required = false) Integer bairro) {
		ModelAndView mv = new ModelAndView("home");
		return mv.addObject("imovel", imoRepo.buscaImovel(bairro));
	}
	
	@GetMapping("/detalhes")
	public String detail() {
		return ("selection");
	}
}
