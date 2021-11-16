package com.konex.adimo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.Cidade;
import com.konex.adimo.Entidades.Imovel;
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
	public ModelAndView home(@RequestParam(required = false) Integer bairro) {
		ModelAndView mv = new ModelAndView("home");	
		
		if(bairro != null) {
			mv.addObject("cidade", cidRepo.findAll());
			mv.addObject("imovel", imoRepo.buscaImovel(bairro));
			mv.addObject("news", new NewsLetter());
			mv.addObject("cid", new Cidade(""));
			return mv;
		}
		else {
		mv.addObject("cidade", cidRepo.findAll());
		mv.addObject("imovel", imoRepo.findAll());
		mv.addObject("news", new NewsLetter());
		mv.addObject("cid", new Cidade());
		return mv;
		}
	}
	
	@GetMapping("/imovel/detalhes/{id}")
	public ModelAndView busca(@PathVariable("id") Integer id, @RequestParam(required = false) Integer bairro) {
		ModelAndView mv = new ModelAndView("selection");
		return mv.addObject("imovel", imoRepo.findById(id));	
	}
	
	@GetMapping("/detalhes")
	public String detail() {
		return ("selection");
	}
	
}
