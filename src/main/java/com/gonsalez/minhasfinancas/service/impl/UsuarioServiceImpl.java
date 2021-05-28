package com.gonsalez.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonsalez.minhasfinancas.exception.RegraNegocioException;
import com.gonsalez.minhasfinancas.model.entity.Usuario;
import com.gonsalez.minhasfinancas.model.repository.UsuarioRepository;
import com.gonsalez.minhasfinancas.service.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean exite = repository.exitsByEmail(email);
		if(exite) {
			throw new RegraNegocioException("Já existe um usuario cadastrado com esse email");
		}
	}

}
