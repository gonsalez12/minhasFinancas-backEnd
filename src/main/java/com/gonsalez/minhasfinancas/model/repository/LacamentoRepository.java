package com.gonsalez.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gonsalez.minhasfinancas.model.entity.Lancamento;

public interface LacamentoRepository extends JpaRepository<Lancamento, Long>{

	
	
}
