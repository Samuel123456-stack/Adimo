package com.konex.adimo.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.Cidade;
import com.konex.adimo.Entidades.NewsLetter;
import com.konex.adimo.Repositorios.NewsLetterRepositorio;

@Controller
public class NewsLetterController {

	@Autowired
	private NewsLetterRepositorio newRepo;
	
	@PostMapping("/newslatter/cadastro/home")
	public ModelAndView cadastroEmail(@Valid @ModelAttribute("news") NewsLetter news, BindingResult result) {
		ModelAndView mv = new ModelAndView("home");
		
		if (result.hasErrors()) {
			mv.addObject("cid", new Cidade(""));
			return mv;
		}
		else {
			newRepo.save(news);
			return mv;
		}
	}
}
