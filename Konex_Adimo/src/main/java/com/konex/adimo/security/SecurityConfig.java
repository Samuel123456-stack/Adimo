package com.konex.adimo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	private UserDetailsService userDetailsService;

	//permissoes e restrições
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/").permitAll()
		.antMatchers("/css/**", "/js/**", "/images/**").permitAll()
		.antMatchers(HttpMethod.GET, "/imovel/detalhes/{id}").permitAll()
		.antMatchers(HttpMethod.GET, "/imovel/favoritos").permitAll()
		.antMatchers(HttpMethod.GET, "/bairro").permitAll()
		.antMatchers(HttpMethod.GET, "/entrarpage").permitAll()
		.antMatchers(HttpMethod.GET, "/telaPainel").hasAnyRole("ADMIN")
		.and().formLogin();

		//telas que necessitam de permissao
		/*
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/imovel/telaPainel").hasRole("ADMIN")
		.anyRequest().authenticated().and().formLogin()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));*/
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(encodePWD());
	}
	
	@Bean
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
}