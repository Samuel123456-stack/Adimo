package com.konex.adimo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/entrarpage")
    public String log() {
        return "entrar";
    }
	
	@PostMapping("/log")
	public ModelAndView loginAcess(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		boolean erro = false;
		
		if("gabriel@adimo.com".equals(email) || "adm@adimo.com".equals(email)) {
			if("123456".equals(senha)) {
				mv = new ModelAndView("redirect:/telaPainel");
			}
		}else {
			erro = true;
			mv.addObject("Por favor, revise os campos", erro);
		}
		return mv;
	}
}
