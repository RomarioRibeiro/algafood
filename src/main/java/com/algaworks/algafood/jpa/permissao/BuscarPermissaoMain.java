package com.algaworks.algafood.jpa.permissao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodDiApplication;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

public class BuscarPermissaoMain {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodDiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		
		Permissao permissao = permissaoRepository.buscar(1L);
		
		
		System.out.printf("%d - %s %s\n", permissao.getId(), permissao.getNome(), permissao.getDescricao());
		
		
		
	}
}
