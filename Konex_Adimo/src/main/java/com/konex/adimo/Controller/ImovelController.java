package com.konex.adimo.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.Imovel;
import com.konex.adimo.Repositorios.ConvenienciaRepositorio;
import com.konex.adimo.Repositorios.ImovelRepositorio;

@Controller
public class ImovelController {
	
	@Autowired
	private ImovelRepositorio imoRepo;
	
	@Autowired
	private ConvenienciaRepositorio conRepo;
	
	private Set<Imovel> favoritos = new HashSet<>();
	
	@GetMapping("/imovel/detalhes/{id}")
	public ModelAndView busca(@PathVariable("id") Integer id, @RequestParam(required = false) Integer bairro) {
		ModelAndView mv = new ModelAndView("selection");
		mv.addObject("imovel", imoRepo.buscaImovelPorId(id));
		mv.addObject("conveniencias", conRepo.buscaListaConveniencia(id));
		return mv;
	}
	
	@GetMapping("/imovel/add")
	public ResponseEntity<Imovel> favoritoAdd(@RequestParam(required = false) Integer id) {

		if (id != null) {
			favoritos.add(imoRepo.buscaImovelPorId(id));
		}
		return ResponseEntity.ok().body(null);
	}

	@GetMapping("/imovel/favoritos")
	public String favoritos(Model model) {
		model.addAttribute("imovel", favoritos);
		return ("favoritos");
	}
}
