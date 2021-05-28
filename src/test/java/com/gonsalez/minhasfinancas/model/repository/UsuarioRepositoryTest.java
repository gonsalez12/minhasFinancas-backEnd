package com.gonsalez.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.gonsalez.minhasfinancas.model.entity.Usuario;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("teste")
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	
	
	@Test
	public void deveVerificarAExistenciaDeEmail() {
		//cenario
		Usuario usuario =  Usuario.builder().nome("usaurio").email("usuario@email.com").build();
		repository.save(usuario);
		
		//ação
		boolean result = repository.exitsByEmail("usaurio@email.com");
		
		//verificação
		
		Assertions.assertThat(result).isTrue();
		
	}
	
}
