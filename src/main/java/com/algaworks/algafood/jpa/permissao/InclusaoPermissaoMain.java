package com.algaworks.algafood.jpa.permissao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodDiApplication;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

public class InclusaoPermissaoMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodDiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);

		Permissao permissao1 = new Permissao();
		permissao1.setNome("permissão para tudo");
		permissao1.setDescricao("Pode ter control total");
		
		Permissao permissao2 = new Permissao();
		permissao2.setNome("permissão da Cozinha");
		permissao2.setDescricao("Pode  controlar a Cozinha");
		
		permissao1 = permissaoRepository.adicionar(permissao1);
		permissao2 = permissaoRepository.adicionar(permissao2);
		
		
		System.out.printf("Foi adicionado %d - %s %s\n", permissao1.getId(), permissao1.getNome(), permissao1.getDescricao());
		System.out.printf("Foi adicionado %d - %s %s\n", permissao2.getId(), permissao2.getNome(), permissao2.getDescricao());
		

	}

}
