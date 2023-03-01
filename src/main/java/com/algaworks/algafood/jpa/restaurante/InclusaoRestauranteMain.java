package com.algaworks.algafood.jpa.restaurante;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodDiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodDiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		RestauranteRepository repositoryRestauranteRepository = applicationContext.getBean(RestauranteRepository.class);
		
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Kelly Lanche");
		restaurante1.setTaxaFrete(new BigDecimal(10));
		
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Sanduba marcão");
		restaurante2.setTaxaFrete(new BigDecimal(10));
		
		restaurante1 = repositoryRestauranteRepository.adicionar(restaurante1);
      	restaurante2 = repositoryRestauranteRepository.adicionar(restaurante2);

		System.out.println(restaurante1.getId() + " - " + restaurante1.getNome() + " R$" + restaurante1.getTaxaFrete());
		System.out.println(restaurante2.getId() + " - " + restaurante2.getNome() + " R$" + restaurante2.getTaxaFrete());
		
		
	}
	
}
