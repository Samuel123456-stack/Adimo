package com.konex.adimo.Controller;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.Conveniencia;
import com.konex.adimo.Entidades.Imovel;
import com.konex.adimo.Entidades.Proprietario;
import com.konex.adimo.Repositorios.BairroRepositorio;
import com.konex.adimo.Repositorios.ConvenienciaRepositorio;
import com.konex.adimo.Repositorios.ImovelRepositorio;
import com.konex.adimo.Repositorios.ProprietarioRepositorio;

@Controller
public class ImovelController {
	
	@Autowired
	private ImovelRepositorio imoRepo;
	
	@Autowired
	private ConvenienciaRepositorio conRepo;
	
	@Autowired
	private BairroRepositorio baiRepo;
	
	@Autowired
	private ProprietarioRepositorio propRepo;
	
	private Set<Imovel> favoritos = new HashSet<>();
	
	@GetMapping("/imovel/detalhes/{id}")
	public ModelAndView busca(@PathVariable("id") Integer id, @RequestParam(required = false) Integer bairro) {
		ModelAndView mv = new ModelAndView("selection");
		mv.addObject("imovel", imoRepo.buscaImovelPorId(id));
		mv.addObject("conveniencias", conRepo.buscaListaConveniencia(id));
		return mv;
	}
	
	@GetMapping("/imovel/add")
	public ResponseEntity<Imovel> addFavorito(@RequestParam(required = false) Integer id) {

		if (id != null) {
			favoritos.add(imoRepo.buscaImovelPorId(id));
		}
		return ResponseEntity.ok().body(null);
	}

	@GetMapping("/imovel/favoritos")
	public String favoritos(Model model) {
		model.addAttribute("imovel", favoritos);
		return ("lista");
	}
	
	@GetMapping("/imovel/favoritos/delete")
	public String deletaFavoritos(@RequestParam("id") Integer id, Model model) {
	    Imovel imovel = imoRepo.buscaImovelPorId(id);
		favoritos.remove(imovel);
		
		return favoritos(model);
	}
	
	@GetMapping("/telaPainel")
	public String telaPainel(Model model) {
		Imovel imovel = new Imovel();
		Conveniencia conv = new Conveniencia();
		Proprietario prop = new Proprietario();
		//Alterar dado depois
		Integer idProp= 1;
		List<Imovel> listaAlugado = imoRepo.listaImovelAlu(idProp);
		
		model.addAttribute("prop", prop);
		model.addAttribute("conv", conv);
		model.addAttribute("imovel", imovel);
		model.addAttribute("bairros", baiRepo.findAll());
		model.addAttribute("listaAlugado", listaAlugado );
		
		return "painel";
		
	}

	@GetMapping("/imovel/cadastro")
	public String cadastroImo(@ModelAttribute("imovel") Imovel imovel,@ModelAttribute("conv") Conveniencia conv, Model model) {
		imoRepo.save(imovel);
		conRepo.save(conv);
		
		return telaPainel(model);
	}
	
	@GetMapping("/imovel/propCadastro")
	public String cadastroProp(@ModelAttribute("prop")Proprietario prop,Model model) {
		propRepo.save(prop);
		
		return telaPainel(model);
	}
	
	@GetMapping("/proprietario/pegaId")
	public String pegaId(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("id", id);
		return telaPainel(model);
	}
	
	@GetMapping("/proprietario/trocaValor")
	public String trocaValor(@ModelAttribute("id") Integer id,@ModelAttribute("imovel") Imovel imo, Model model) {
        Imovel imovel = imoRepo.findById(id).get();
        imovel.setValor(imo.getValor());
        imoRepo.save(imovel);
		return telaPainel(model);
		
	}
	
	@GetMapping("/proprietario/consultaCPF")
	public String consultaCPF(@ModelAttribute("prop") Proprietario prop,Model model) {
		Random ale = new Random();
		int restringe = ale.nextInt(10+1);
		model.addAttribute("restringe", restringe);
		return telaPainel(model);
	}
}
