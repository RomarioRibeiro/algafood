package com.algaworks.algafood.jpa.cidade;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodDiApplication;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;

public class InclusaoCidadeMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodDiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		Cidade cidade1 = new Cidade();
		cidade1.setNome("Pinhalzinho");
		
		
		Cidade cidade2 = new Cidade();
		cidade2.setNome("Maringa");
		
		cidade1 = cidadeRepository.adicionar(cidade1);
		cidade2 = cidadeRepository.adicionar(cidade2);
		
		
		System.out.printf("Incluindo as Cidade %d %s\n", cidade1.getId(), cidade1.getNome());
		System.out.printf("Incluindo as Cidade %d %s\n", cidade2.getId(), cidade2.getNome());
		
		
	}

}
