package com.algaworks.algafood.jpa.estado;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodDiApplication;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;

public class BuscarEstadoMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodDiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		EstadoRepository estadoRepository = applicationContext.getBean(EstadoRepository.class);
		
		Estado estado = estadoRepository.buscar(1L);
		
		System.out.printf("Buscando o %d - %s\n", estado.getId(), estado.getNome());
		
		
	}

}
