package com.konex.adimo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.Cidade;
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
	public ModelAndView home(@RequestParam(required = false) Integer bairro, @ModelAttribute("cid") Cidade cidade) {
		ModelAndView mv = new ModelAndView("home");

		if (bairro != null) {
			mv.addObject("cidades", cidRepo.findAll());
			mv.addObject("ulCid", cidade);
			mv.addObject("imovel", imoRepo.buscaImovelPorBairro(bairro));
			mv.addObject("news", new NewsLetter());
			return mv;
		} else {
			mv.addObject("cidades", cidRepo.findAll());
			mv.addObject("imovel", imoRepo.findAll());
			mv.addObject("news", new NewsLetter());
			return mv;
		}
	}
	
	@GetMapping("/entrarpage")
    public String log() {
        return "entrar";
    }
}
