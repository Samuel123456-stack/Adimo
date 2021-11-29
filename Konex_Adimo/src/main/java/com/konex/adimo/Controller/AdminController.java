package com.konex.adimo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.konex.adimo.Entidades.User;
import com.konex.adimo.Repositorios.UserRepository;

@Controller
@RequestMapping("/secure/auth/")
public class AdminController {
/*
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user) {
		String pwd = user.getPassword();
		String encryptPwd = passwordEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		userRepository.save(user);
		return "Usuario adicionado com sucesso"; //posso retornar com uma Model para o login
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/imovel/telaPainel")
	public String securedHello() {
		return "painel";
	}
*/	
}
