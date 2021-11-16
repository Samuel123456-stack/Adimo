package com.konex.adimo.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.konex.adimo.Entidades.NewsLetter;
import com.konex.adimo.Repositorios.NewsLetterRepositorio;

@Controller
public class NewsLetterController {

	@Autowired
	private NewsLetterRepositorio newRepo;
	
	@PostMapping("/newslatter/cadastro/home")
	public String cadastroEmail(@Valid @ModelAttribute("news") NewsLetter news, BindingResult result) {
	
		if (result.hasErrors()) {
			return "home";
		}
		newRepo.save(news);
		return "redirect:/";
	}
}
