package com.oxsys.topcon;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.oxsys.topcon.repository.FormDinamicoRepository;
import com.oxsys.topcon.security.JwtFilter;
import com.oxsys.topcon.service.CarregarDadosIniciais;

@SpringBootApplication
public class TopconApplication {

	@Autowired
	 CarregarDadosIniciais carregarDados; 
	
	@Autowired FormDinamicoRepository repoDinamico;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(TopconApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		carregarDados.init();	

	}
	
	
	@Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.addUrlPatterns("/apiX/*");
        return registrationBean;
	}
	
	
}
