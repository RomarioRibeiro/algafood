package com.algaworks.algafood.jpa.cidade;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodDiApplication;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;

public class ExclusaoCidadeMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodDiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		
		Cidade cidade = new Cidade();
		cidade.setId(1L);
		
		cidadeRepository.remover(cidade);
		
		System.out.printf("Cidade excluida %s\n ", cidade.getNome());
		
		
	}

}
