package com.konex.adimo.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.Cidade;
import com.konex.adimo.Entidades.Imovel;
import com.konex.adimo.Entidades.NewsLetter;
import com.konex.adimo.Repositorios.CidadeRepositorio;
import com.konex.adimo.Repositorios.ConvenienciaRepositorio;
import com.konex.adimo.Repositorios.ImovelRepositorio;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private CidadeRepositorio cidRepo;

	@Autowired
	private ImovelRepositorio imoRepo;

	@Autowired
	private ConvenienciaRepositorio conRepo;
	private Set<Imovel> favoritos = new HashSet<>();

	@GetMapping
	public ModelAndView home(@RequestParam(required = false) Integer bairro, @ModelAttribute("cid") Cidade cidade) {
		ModelAndView mv = new ModelAndView("home");

		if (bairro != null) {
			mv.addObject("cidades", cidRepo.findAll());
			mv.addObject("ulCid", cidade);
			mv.addObject("imovel", imoRepo.buscaImovelPorBairro(bairro));
			mv.addObject("news", new NewsLetter());
			return mv;
		} else {
			// mv.addObject("ulCid", new Cidade());
			mv.addObject("cidades", cidRepo.findAll());
			mv.addObject("imovel", imoRepo.findAll());
			mv.addObject("news", new NewsLetter());
			return mv;
		}
	}

	@GetMapping("/imovel/detalhes/{id}")
	public ModelAndView busca(@PathVariable("id") Integer id, @RequestParam(required = false) Integer bairro) {
		ModelAndView mv = new ModelAndView("selection");
		mv.addObject("imovel", imoRepo.buscaImovelPorId(id));
		mv.addObject("conveniencias", conRepo.buscaListaConveniencia(id));
		return mv;
	}

	@GetMapping("/imovel/favoritos/{id}")
	public String favoritoAdd(@PathVariable Integer id, Model model) {

		if (id != null) {
			favoritos.add(imoRepo.buscaImovelPorId(id));
			model.addAttribute("imovel", favoritos);
		}
		return ("favoritos");
	}
	
	@GetMapping("/imovel/favoritos2")
	public String favoritoAdd2(@RequestParam(required = false) Integer id, Model model) {

		if (id != null) {
			favoritos.add(imoRepo.buscaImovelPorId(id));
			model.addAttribute("imovel", favoritos);
		}
		return ("favoritos");
	}

	@GetMapping("/imovel/favoritos")
	public String favoritos(Model model) {
		model.addAttribute("imovel", favoritos);
		return ("favoritos");
	}
}
